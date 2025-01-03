
import java.util.Scanner;

public class FunctionMultiply {
    
  public static int Mlti(int a, int b){
      
    int sum = a*b;
    return sum;
  }

    public static void main(String[] args) {
        
        System.out.print("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = Mlti(a, b);
        System.out.println("The product of two numbers is = " + sum);
    }
}
