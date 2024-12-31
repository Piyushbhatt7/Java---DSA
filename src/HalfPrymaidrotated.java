
import java.util.Scanner;

public class HalfPrymaidrotated {
      public static void main(String[] args) {
          
            int i,j,n;

            System.out.println("Enter any number: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            for(i=1;i<=n;i++){
                  System.out.println();

                  for(j=1;j>=i;j--){
                        System.out.print("*");
                  }

            }
      }
}
