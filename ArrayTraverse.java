
import java.util.Scanner;

public class ArrayTraverse {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0;i<size;i++){
            
            System.out.println("Enter number: ");
            number[i] = sc.nextInt();
        }

        System.out.println("Enter number to find : ");
        int x = sc.nextInt();

        // output

        for(int i=0;i<size;i++){

            if(number[i] == x){
                System.out.println(x + "found at index " + i);
            }
        }
    }
}
