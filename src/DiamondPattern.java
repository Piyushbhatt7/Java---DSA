
import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {

        int i, j, k, n;

        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // uper half
        for (i = 1; i <= n; i++) {

            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // lower half
        for (i = n; i >= 1; i--) {

            for (j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
