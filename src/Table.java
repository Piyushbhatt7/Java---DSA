
import java.util.Scanner;

public class Table {
     public static void main(String[] args) {
         
         int n;
         int sum = 0;


         System.out.println("Enter any number: ");
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

         for(int i =1; i<= n ; i++){
            
            sum = sum*n;
         }
         System.out.println(sum);
     }
} 
