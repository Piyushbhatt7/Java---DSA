
import java.util.Scanner;

public class Factorial {
    
    public static int factNumber(int n){

        int fact = 1;

        for(int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System)
    }
}
