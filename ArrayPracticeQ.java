
import java.util.Scanner;

// Take an array as input from user. Search for a given umber x and print the index at which it ocurs.


public class ArrayPracticeQ {
    public static void main(String[] args) {
        
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int [size];

        for(int i=0;i<size;i++){
            System.out.print("Enter numbers: ");
             number[i] = sc.nextInt();
        }
        
        System.out.print("Enter number to found!");
        int x = sc.nextInt();

        // output
            
        for(int i = 0 ; i<number.length; i++){
             if(number[i] == x){
                 System.out.println("X found at index " + i);
             }
        }

    }
}
