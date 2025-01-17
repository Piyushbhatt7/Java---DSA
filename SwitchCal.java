
import java.util.Scanner;

public class SwitchCal {
    
    public static void main(String[] args) {
        
        double num1, num2, sum;
        char operat;
        System.out.print("Enter number1: ");  
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        System.out.print("Enter number2: ");
        num2 = sc.nextDouble();
        System.out.print("Choose any one operator ('+,-,*,/,%'): ");
        operat = sc.next().charAt(0);

        switch (operat) {
            case '+':
                    sum = num1 + num2;
                    break;
            case '-':
                    sum = num1 - num2;
                    break;
            case '*':
                    sum = num1 * num2;
                    break;
            case '/':
                    sum = num1 / num2;
                    break;
            case '%':
                    sum = num1 / num2;

            default:
                throw new AssertionError("Invalid input");
        }

        System.out.println(sum);
    }
}
