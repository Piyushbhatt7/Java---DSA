
import java.util.Scanner;

public class ArrayPractice {
    
    public static void main(String[] args) {
        
        System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];   // user input array size

        for(int i=0;i<size;i++){

            System.out.println(number[i]);
        }


    }
}
