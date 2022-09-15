import java.io.Serializable;

public class Product implements Serializable {

    private int id;
    private String productName; 
    private int count;

    public Product(int id, String productName, int count)
    {
        this.id = id;
        this.productName = productName;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product [Id=" + id + " ProductName=" + productName + " Count=" + count + "]";
    }
}
