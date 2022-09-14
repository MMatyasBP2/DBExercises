import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Repository implements Serializable {

    private static final long serialVersionUID = 1L;
    String building;
    int line;
    int column;
    int floor;
    String productName;
    int count;

    public Repository(String building, int line, int column, int floor, String productName, int count)
    {
        this.building = building;
        this.line = line;
        this.column = column;
        this.floor = floor;
        this.productName = productName;
        this.count = count;
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
