
import java.io.File;

public class DeletingAFile {
    
    public static void main(String[] args) {
        
        File myFile = new File("Newfile.txt");
        if(myFile.delete())
        {
            System.out.println("File deleted uccessfully " + myFile.getName());

        }

        else{
            System.out.println("Error occured while deleting a file");
        }
    }
}
