public class App {
    public static void main(String[] args) throws Exception {

        Repository[] repos = {new Repository("Csavarraktár", 
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
                                new Repository("Gyümölcsraktár", 
                                                13, 
                                              80, 
                                               0, 
                                new Product[]{(
                                new Product(
                                    01,
                                    "Málna",
                                    20))})};        

        Repository.storing(repos);
        Repository.reading("REK.DAT");
    }
}
