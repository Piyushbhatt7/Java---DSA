import java.util.Scanner;

public class TransposeMatrix {
    
    public static void main(String[] args) {
        
        System.out.print("Enter rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];
        
        // inputs

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                numbers[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // outputs

        // for(int i=0;i<rows;i++){
             
        //     for(int j=0;j<cols;j++){

        //         System.out.print(numbers[i][j] + " ");
        //     }

        //     System.out.println();
        // }
           // Transpose of Matrix

        System.out.println("The Transpose of Matrix is: ");

        for(int i=0;i<cols;i++){
            for(int j=0; j<rows; j++){

                System.out.print(numbers[i][j] + " ");
            }
        }

    }
}
