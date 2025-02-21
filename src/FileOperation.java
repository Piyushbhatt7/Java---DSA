
import java.io.File;
import java.io.IOException;

public class FileOperation {
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("example.txt");

        if(file.createNewFile())
        {
            System.out.println("File created " + file.getName());
        }

        else {
            System.out.println("File already exists");
        }

        System.out.println("File path " + file.getAbsolutePath());
        System.out.println("Is writable " + file.canWrite());
        System.out.println("Is readable " + file.canRead());
    }
}
