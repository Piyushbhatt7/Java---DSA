
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTypes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int remainder = sc.nextInt();
        System.out.print("Enter second number: ");
        int denominator = sc.nextInt();
        int result;

        try{

            result = remainder / denominator;
            System.out.print("Result: " + result);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by Zero!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        catch(InputMismatchException e)
        {
            System.out.println("Wrong input giver!");
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Programm ended!");
        }


    }
}
