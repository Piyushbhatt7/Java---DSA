
import java.util.Scanner;

public class DiamondPattern {
    
    public static void main(String[] args) {
        
        int i,j,k,n;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<=n;i++){

            
            for(j=n;j>=i;j--){
                System.out.println(" ");
            }
            for(j=1;j<=;j++){
                System.out.println("*");
            }
        }
        
    }
}
