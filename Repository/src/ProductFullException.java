public class ProductFullException extends Exception {
    public ProductFullException() {
        super("Number of products must be between 1 and 10!");
    }
}
