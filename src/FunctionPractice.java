
import java.util.Scanner;

public class FunctionPractice {
    
  public static int sumAdd(int a, int b){
       
    int sum = a+b;
    return sum;
  }


    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int sum = sumAdd(a, b);
       System.out.println(sum);
    }
}
