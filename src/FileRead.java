
import java.io.File;
import java.util.Scanner;

public class FileRead {
    
    public static void main(String[] args) {
        
        // file reading 

        File myFile = new File("Newfile.txt");

        try {

            Scanner sc = new Scanner(myFile);
            
        } catch (Exception e) {

        }
    }
}
