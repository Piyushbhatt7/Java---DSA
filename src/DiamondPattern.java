
import java.util.Scanner;

public class DiamondPattern {
    
    public static void main(String[] args) {
        
        int i,j,k,n;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<=n;i++){

            
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}
