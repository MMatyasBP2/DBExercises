public class App {
    
    private static final String FILE = "REK.DAT";
    public static void main(String[] args) throws Exception {

        Repository[] repos = {new Repository("Csavarraktar", 
                                            3, 
                                            2, 
                                            1, 
                              new Product[]{
                                new Product(
                                    "Anyacsavar", 
                                    12), 
                                new Product(
                                    "Csillagcsavar", 
                                    10)}),
                                new Repository("Gyumolcsraktar", 
                                                13, 
                                              80, 
                                               0, 
                                new Product[]{(
                                new Product(
                                    "Malna",
                                    20))})}; 
        
        // Writing the first Product to the binary file
        Repository.writeData(FILE, repos[0].getProducts()[0].toString(), 5);
        
        // Reading the first Product from the binary file
        System.out.println(new String(Repository.readData(FILE, 1, 10000)));

        // Appending the second Product to the binary file
        System.out.println("\nAfter appending:\n");
        Repository.appendData(FILE, "\n\n" + repos[0].getProducts()[1].toString());
        Repository.appendData(FILE, "\n\n" + repos[1].getProducts()[0].toString());

        // Reading the second Product from the binary file
        System.out.println(new String(Repository.readData(FILE, 1, 10000)));

        // Deleting the first Product from the binary file

    }
}
