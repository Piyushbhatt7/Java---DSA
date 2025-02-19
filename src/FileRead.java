
import java.io.File;
import java.util.Scanner;

public class FileRead {
    
    public static void main(String[] args) {
        
        // file reading 

        File myFile = new File("Newfile.txt");

        try {

            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            
        } catch (Exception e) {

            System.out.println("Unable to read a file content");
            e.printStackTrace();

        }
    }
}
