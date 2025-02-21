
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent{

    public static void main(String[] args) throws IOException {
        
        String source = "source.txt";
        String destination  = "destination.txt";

        try (FileReader fr = new FileReader(source); 
            FileWriter fw = new FileWriter(destination)
        )
        {
            int chararacter;

            while((chararacter = fr.read()) != -1)
            {
                fw.write(chararacter);
            }

            System.out.println("File content copied successfull");
        }

        catch(FileNotFoundException e)
        {
            System.out.println("File not found " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error during file operation " + e.getMessage());
        }
    }
}