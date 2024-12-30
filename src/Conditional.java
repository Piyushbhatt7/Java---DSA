
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
    

    System.out.print("Enter any number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    if(num%2 == 0){
        System.out.println("Even number");
    }
    else {
        System.out.println("Odd number");
    }

  }
}
