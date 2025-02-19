
import java.io.File;

public class CreateNewFile {
    
    public static void main(String[] args) {
        
        File myFile = new File("Newfile.txt");
        try {
            
            myFile.createNewFile();
        } 
        catch (Exception e) {
            System.out.println("File creation failed");
            e.printStackTrace();
        }
    }
}
