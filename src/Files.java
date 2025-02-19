import java.io.File;
import java.util.Scanner;

public class Files {
    
    public static void main(String[] args) {
        
        // code to create a new file
        // File myFile = new File("Files.txt");

        // try {
        //     myFile.createNewFile();
        // } 
        // catch (IOException e) {
        //     System.out.println("Unable to create this file");
        //     e.printStackTrace();
        // }

        // code to write to a file

        // try 
        //  {
        //     FileWriter myFileWriter = new FileWriter("chwfile.txt");
        //     myFileWriter.write("This is first file form java file handling");
        //     myFileWriter.close();
        // } 
        // catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // reading a file
        File myFile = new File("chwfile.txt");
        try {
            
            Scanner ssc = new Scanner(myFile);
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
      

    
    }
}
