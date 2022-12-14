import java.io.*;
import java.util.Arrays;


public class Repository implements Serializable {

    private String building;
    private int line;
    private int column;
    private int floor;
    private Product[] products;

    public Repository(String building, int line, int column, int floor, Product[] products)
    {
        this.building = building;
        this.line = line;
        this.column = column;
        this.floor = floor;

        try {
            if(products.length <= 10) {
                this.products = products;
            } else {
                throw new ProductFullException();
            }
        } catch (ProductFullException pfe) {
            pfe.getMessage();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Repository [Building=" + building + " Column=" + column + " Floor=" + floor + " Line=" + line
                + ",\nProducts=" + Arrays.toString(products) + "]";
    }

    public static byte[] readData(String filePath, int seek, int chars) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(seek);
		byte[] bytes = new byte[chars];
		file.read(bytes);
		file.close();
		return bytes;
	}

    public static void writeData(String filePath, String data, int seek) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(seek);
		file.write(data.getBytes());
		file.close();
	}

    public static void appendData(String filePath, String data) throws IOException {
		RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
		raFile.seek(raFile.length());
        raFile.writeUTF("\n");
		raFile.write(data.getBytes());
		raFile.close();
	}

    public static void deleteData(String filePath, String data) throws IOException {
        String record;

        File tempDB = new File("rekord.DAT");
        File db = new File(filePath);

        BufferedReader br = new BufferedReader( new FileReader( db ) );
        BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );

        while( ( record = br.readLine() ) != null ) {
            if( record.contains(data) ) 
                continue;

            bw.write(record);
            bw.flush();
            bw.newLine();
        }

        br.close();
        bw.close();
        db.delete();
        tempDB.renameTo(db);
    }
}
