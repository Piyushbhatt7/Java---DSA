
import java.util.Scanner;

public class ButterflyPatter {
    
    public static void main(String[] args) {
        
        int i,n,j;

        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<+n;i++){

            for(j=1;j<=i;j++){
                System.out.println();
            }
        }
    }
}
