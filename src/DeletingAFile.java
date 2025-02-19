
import java.io.File;

public class DeletingAFile {
    
    public static void main(String[] args) {
        
        File myFile = new File("File.txt");
        if(myFile.delete())
        {
            System.out.println("File deleted uccessfully " + myFile.getName());
            
        }
    }
}
