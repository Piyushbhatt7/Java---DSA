
import java.util.Scanner;

public class Students {
    
    
   
       
    int rollno;
    String name;

      void printData(int r, String n) {
         
        rollno = r;
        name = n;
      }

      void printInfo() {
         
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        
       
        System.out.print("Enter you rollNo.: ");
        rollno = sc.nextInt();
      
    }

    public static void main(String[] args) {
       
        Students obj = new Students();
        obj.printInfo();
        System.out.println(obj.name );
        System.out.println(obj.rollno);

    }
}
