import java.io.File;
import java.io.IOException;

public class FileExample {
    
    public static void main (String[] args) {
        File file = new File("example.txt");
        
        try {
            if(file.createNewFile())
            {
                System.out.println("File created: " + file.getName());
                
            }
             
            else {
                System.out.println("File already exists");
            }
            
            System.out.println("File created: " + file.getAbsolutePath());
            System.out.println("File created: " + file.canWrite());
            System.out.println("File created: " + file.canRead());
        } 
        catch (IOException e) {
            System.out.println("An error occurred.");  //
            e.printStackTrace();
        }
    }
}
