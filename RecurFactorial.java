
import java.util.Scanner;

public class RecurFactorial {
    

   public static int printFactorial(int n)
   {   if(n == 1 || n == 0) {
         return 1;
   }
       int fact = printFactorial(n-1);
       int fact_n = n*fact;
       return  fact_n;
   }


    public static void main(String[] args) {
        
        
        int n = 5;
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ans = printFactorial(n);
        System.out.print(ans);

    }
}
