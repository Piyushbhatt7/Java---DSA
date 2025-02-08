
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // output 
        // System.out.println("Hello, World!");

        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");

        // int a = 10;
        // int b = 5;

        // int ans = a*b / a-b;
        // System.out.println(ans);            * / % > + -

        // int ans = (a*b) / (a-b);
        // System.out.println(ans);


        int a,b,sum;

        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);  
        a = sc.nextInt();    
        System.out.print("Enter second number: ");
        
        b = sc.nextInt();

        sum = a+b;
        System.out.println("The sum is =  " + sum);
        

    }
}
