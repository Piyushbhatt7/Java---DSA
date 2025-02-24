
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFileReaderr {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try(java.io.FileReader fr = new java.io.FileReader("Source.txt");
           FileWriter fw  = new FileWriter("test.txt")
        )
        {
            int read;
            while((read = fr.read()) != -1)
            {
                fw.write(read);
            }
        }

        catch(IOException e)
        {
            System.out.println("File not found!");
            System.out.println(e.getMessage());
        }
    }
}
