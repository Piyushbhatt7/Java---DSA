
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
         
        int i,j, n, m;
        System.out.print("Enter row number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter column number: ");
        m = sc.nextInt(); 

        // outer loop

        for(i =1 ; i<=n ; i ++){

            // inner loop

            for(j = 1 ; j<=m ; j++){
                
                // cell -> i,j
                if(i == 1 || j == 1 || i == n || j == m){
                System.out.print("*");
                }
            }
            System.out.println();

        }
        
    }
}
