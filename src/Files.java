
import java.io.File;

public class Files {
    
    public static void main(String[] args) {
        
        File myFile = new File(pathname: "Files.txt");

        try {
            myFile.createNewFile();
        } 
        catch (Exception e) {
        }
    }
}
