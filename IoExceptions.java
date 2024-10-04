import java.io.File;
import java.io.FileReader;

public class IoExceptions {
    
    public static void main(String[] args) {
        try{
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file);

        } catch (Exception e){
            System.err.println("Checked exception " + e.getMessage());
        }
        //int result = 10/10;
    }
}