
import java.util.Scanner;

public class Table {
     public static void main(String[] args) {
         
         int n;
         int sum;


         System.out.print("Enter any number: ");  
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
 
         for(int i =1; i<= 10 ; i++){
            
            sum = n*i;
            System.out.println(sum);
         }
         
     }
}  
