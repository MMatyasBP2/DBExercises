import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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

    public void storing(Repository repos[])
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

    
}
