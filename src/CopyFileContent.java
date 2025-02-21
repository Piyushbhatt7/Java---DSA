
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent{

    public static void main(String[] args) throws IOException {
        
        String source = "mysource.txt";
        String destination  = "mydestination.txt";

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
    }
}