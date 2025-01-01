
import java.util.Scanner;



public class FloydsTriangle {
    public static void main(String[] args) {
        
        int i,j,n;
        int number = 1;


        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
       
        for( i = 1; i<= n; i++){

            for(j = 1; j<=i; j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }

    }
}
