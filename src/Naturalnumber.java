import java.util.Scanner;

public class Naturalnumber {
    public static void main(String[] args) {
        
        int i, n;
        int sum = 0;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(i = 1; i <= n ; i++){
              sum = sum+i;   // sum += i;
        }
        System.out.println("Sum of natural number is = " + sum);
    }
}
