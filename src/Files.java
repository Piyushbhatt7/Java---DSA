
import java.io.File;
import java.io.IOException;

public class Files {
    
    public static void main(String[] args) {
        
        File myFile = new File(pathname: "Files.txt");

        try {
            myFile.createNewFile();
        } 
        catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
    }
}
