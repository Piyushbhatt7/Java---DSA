
import java.io.IOException;
import java.util.Scanner;

public class SpecificExceptions {
    
    public static void main(String[] args) {
        
        int marks[] = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index");
        int idx = sc.nextInt();

        System.out.println("Enter the number you want to devide index");
        int number = sc.nextInt();

        try {
            
            System.out.println("The value at array index is: " + marks[idx]);
            System.out.println("The value of array value divide by is: " + marks[idx] / number);
        } 
        catch (Exception e) {

            System.out.println("Some exception occured");
            System.out.println(e);
        }

        catch (IOException e) {

            System.out.println("Some exception occured");
            System.out.println(e);
        }

        catch (ArithmeticException e) {

            System.out.println("Some exception occured");
            System.out.println(e);
        }
    }
}
