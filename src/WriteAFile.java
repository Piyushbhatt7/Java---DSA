
import java.io.File;
import java.io.FileWriter;

public class WriteAFile {
    
    public static void main(String[] args) {
        
        File myFile = new File("Newfile.txt");

        try {
            
            FileWriter myFileWriter = new FileWriter("Newfile.txt");
        } 
        catch (Exception e) {
        }
    }
}
