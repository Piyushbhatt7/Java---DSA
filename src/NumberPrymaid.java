
import java.util.Scanner;

public class NumberPrymaid {
    
    public static void main(String[] args) {
        
        int i,n,j;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<=n;i++){

            for(j=1;j<=n-i;j++){

                System.out.print(" ");

            }
            for(j=1;j<=i;j++){
                System.out.print(j);
                j++;
            }
            System.out.println();
           
        }
        
    }
}
