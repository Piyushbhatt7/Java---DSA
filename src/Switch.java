
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        int button;
        
        System.out.print("Enter number from 1-3: ");
        Scanner sc = new Scanner(System.in);
        button = sc.nextInt();

        if(button == 1){
            System.out.println("Hello");
        }

        else if(button == 2){
            System.out.println("Namaste");
        }

        else if(button == 3){
            System.out.println("Bonjour");
        }

        else{
            System.out.println("Invalid Button");
        }
    }
}
