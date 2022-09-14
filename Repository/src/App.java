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

        Repository.storing(repos);
        Repository.reading(FILE);
    }
}
