
import java.util.Scanner;

public class ButterflyPatter {

    public static void main(String[] args) {

        int i, n, j;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // first half
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);

            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for (i = n; i >= 1; i--) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);

            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
