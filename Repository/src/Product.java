import java.io.Serializable;

public class Product implements Serializable {

    private String productName; 
    private int count;

    public Product(String productName, int count)
    {
        this.productName = productName;
        this.count = count;
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
        return "Product [ProductName=" + productName + " Count=" + count + "]";
    }
}
