import java.util.Scanner;

public class TransposeMatrix {
    
    public static void main(String[] args) {
        
        System.out.print("Enter rows: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                numbers[i][j] = sc.nextInt();
            }
        }

    }
}
