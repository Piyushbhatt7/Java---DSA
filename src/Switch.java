
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        int button;

        Scanner sc = new Scanner(System.in);
        button = sc.nextInt();

        if(button == 1){
            System.out.println("Hello");
        }

        else if(button == 2){
            System.out.println("Namaste");
        }
    }
}
