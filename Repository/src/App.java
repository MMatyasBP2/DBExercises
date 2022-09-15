public class App {
    
    private static final String FILE = "REK.DAT";
    public static void main(String[] args) throws Exception {

        Repository[] repos = {new Repository("Csavarraktar", 
                                            3, 
                                            2, 
                                            1, 
                              new Product[]{
                                new Product(
                                    01,
                                    "Anyacsavar", 
                                    12), 
                                new Product(
                                    02,
                                    "Csillagcsavar", 
                                    10)}),
                                new Repository("Gyumolcsraktar", 
                                                13, 
                                              80, 
                                               0, 
                                new Product[]{(
                                new Product(
                                    01,
                                    "Malna",
                                    20))})}; 
                                    
        Repository.writeData(FILE, repos[0].toString(), 5);
        System.out.println(new String(Repository.readData(FILE, 1, 10000)));
        System.out.println("\nAfter appending:\n");
        Repository.appendData(FILE, "\n\n" + repos[1].toString());
        System.out.println(new String(Repository.readData(FILE, 1, 10000)));

    }
}
