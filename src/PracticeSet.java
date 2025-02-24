
import java.util.Scanner;

public class PracticeSet {
    
    public static void main(String[] args) {
        
        // problem 1

        // Syntax Error - int a = 7
        // int age = 78;
        // Logical Error - int year_born = 2000-78;
        //System.out.println(6/0);

        // problem 2

        // try {
        //     int a = 66/0;

        // } 
        // catch (IllegalArgumentException e) {
        //      System.out.println("hehe");
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("haha");
        // }

        // problem 3

        boolean flag = true;
        int marks [] = {7,56,6};
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int i = 0;
        while(flag && i<5)

        try{
        {
           System.out.println("The value of marks[index] is : " + marks[index]);
           i++;
        }
    }

    catch (Exception e)
    {
        System.out.println("Invalid Index");
        i++;
        flag = false;
    }

    }
}
