import java.io.File;

public class Files {
    
    public static void main(String[] args) {
        
        //code to create a new file
        File myFile = new File("Files.txt");

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
        //     myFileWriter.write("This is first file form java file handling \n hii");
        //     myFileWriter.close();
        // } 
        // catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // reading a file
        // File myFile = new File("chwfile.txt");
        // try {
            
        //     Scanner sc = new Scanner(myFile);
        //     while(sc.hasNextLine())
        //     {
        //        String line = sc.nextLine();
        //        System.out.println(line);
        //     }

        //     sc.close();
        // } 
        // catch (Exception e) {
        //     e.printStackTrace();
        // }

        // deleting a file
      
        // File myFile = new File("chwfile.txt");
        // if(myFile.delete())
        // {
        //     System.out.println("File deleted successfully " + myFile.getName());
        // }

        // else {
        //     System.out.println("Error occurred while deleting the file");
        // }
        
        
    
    }
}
