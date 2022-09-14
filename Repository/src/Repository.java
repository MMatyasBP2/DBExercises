import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;

public class Repository implements Serializable {

    private static final long serialVersionUID = 1L;
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
        this.products = products;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
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

    public static void storing(Repository repos[])
    {
        try {

            ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream("REK.DAT")
            );

            for (Repository repository : repos) {
                if(repos.length != 10)
                    output.writeObject(repository);
                else
                    break;
            }

            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void reading(String fileName)
    {
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) != null)
            {
                System.out.println(line.toUpperCase());
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }

    public static void adding(String fileName, Repository addingRecord)
    {
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "wa");
            raf.seek(raf.length());
            raf.writeBytes(addingRecord.building);
            raf.writeInt(addingRecord.line);
            raf.writeInt(addingRecord.column);
            raf.writeInt(addingRecord.floor);
            raf.writeBytes(addingRecord.products.toString());
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleting(String fileName, Repository deletingRecord)
    {

    }
}
