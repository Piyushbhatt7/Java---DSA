
import java.util.Scanner;

public class SoliidRactangle {
    public static void main(String[] args) {
        
        int i,j,n;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i=1;i<n;i++){
            for(j=1;j<n;j++){
                System.out.print("*");
            }
        }
    }
}