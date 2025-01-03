
import java.util.Scanner;

public class ArrayPractice {
    
    public static void main(String[] args) {
        
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];   // user input array size
        

        // input 

        for(int i=0;i<size;i++){
            System.out.print("Enter any numbers: ");
            number[i] = sc.nextInt();
        }

        // output

        for(int i=0;i<size;i++){

            System.out.println("The array numbers are = " + number[i]);
        }


    }
}
