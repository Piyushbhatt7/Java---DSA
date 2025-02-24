
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTypes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int remainder = sc.nextInt();
        System.out.println("Enter second number: ");
        int denominator = sc.nextInt();
        int result;

        try{

            result = remainder / denominator;
            System.out.println("Result: " + result);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by Zero!");
            System.out.println(e.getMessage());
        }

        catch(InputMismatchException e)
        {
            System.out.println("Wrong input giver!");
            System.out.println(e.getMessage());
        }


    }
}
