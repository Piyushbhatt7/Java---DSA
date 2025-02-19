
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile {
    
    public static void main(String[] args) {
        
        File myFile = new File("Newfile.txt");

        try {
            
            FileWriter myFileWriter = new FileWriter("Newfile.txt");
            myFileWriter.write("new file created a writing on it");
        } 
        catch (IOException e) {
            System.out.println("Failed to create a file");
            e.printStackTrace();
        }
    }
}
