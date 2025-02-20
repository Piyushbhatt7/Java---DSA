
import java.util.Scanner;

public class NestesdTryCatch {
    
    public static void main(String[] args) {

        int marks[] = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 12;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter array index");
        int idx = sc.nextInt();
        
        
        try {
            
            System.out.println("WElcome to nested try catch");

            try {
                
                System.out.println(marks[9]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Sorry this index does not exists");
                  System.out.println("Exception in level 1");
            }
        } 
        catch (Exception e) {

            System.out.println("Exception in level 2");
        }
    }
}
