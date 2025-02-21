
import java.util.Scanner;

public class ExceptionClass  extends Exception{

    @Override
    public String toString()
    {
        return super.toString() + "- I am toString()";
    }

    @Override
    public String getMessage()
    {
        return super.getMessage() + "- I am getMessage()";
    }
    
    public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a>9)
        {

           try {
            throw new ExceptionClass();
           } 
           catch (Exception e) {
              
            System.out.println(e.getMessage());
           }
        }
    }
}
