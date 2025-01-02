
import java.util.Scanner;

public class PalindromicPattern {
    
    public static void main(String[] args) {
        
        int i,j,n;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<=n;i++){

            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(j=2;j<=i;j++){
                System.out.print(j-i);
            }
            System.out.println();
        }
    }
}
