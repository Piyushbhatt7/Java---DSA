
import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        //     System.out.print("Enter your age: ");
        //     Scanner sc = new Scanner(System.in);
        //     int age = sc.nextInt();
        //     if(age > 18) {
        //         System.out.println("Adult");
        //     }
        //     else{
        //         System.out.println("Children");
        //     }
        // odd and even number check
        // System.out.print("Enter any number: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("Even number");
        // }
        // else {
        //     System.out.println("Odd number");
        // }
        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter number number: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();

        if (a == b) {

            System.out.println("Both number are equal");
        } else if (a > b) {
            System.out.println("A is greter then B");
        } else {
            System.out.println("A is less then B");
        }

    }
}
