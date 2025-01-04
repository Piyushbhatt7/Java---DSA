import java.util.Scanner;

public class Matric {
    
    public static void main(String[] args) {
        
        System.out.print("Enter number of rows : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                numbers[i][j] = sc.nextInt();

            }
        }

         // output

         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
         }
    }
}
