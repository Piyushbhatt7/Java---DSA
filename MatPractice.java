
import java.util.Scanner;



public class MatPractice {
    
    public static void main(String[] args) {
        
        System.out.print("Enter rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int numbers [][] = new int[rows][cols];
        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){
            numbers[i][j] = sc.nextInt();

            }
        }
        
        System.out.print("Enter number to found: ");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 
                // compare
                if(numbers[i][j] == x){
                    System.out.print(x + " Found at location ("+ i + "," + j + ")");
                }
            }
        }
    }
}
