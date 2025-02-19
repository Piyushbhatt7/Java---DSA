
import java.io.File;
import java.io.IOException;

public class Files {
    
    public static void main(String[] args) {
        
        // code to create a new file
        File myFile = new File("Files.txt");

        try {
            myFile.createNewFile();
        } 
        catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}
