
import java.util.Scanner;

public class ExceptionClass  extends Exception{


    public ExceptionClass(String message)
    {
        super(message);
    }
    @Override
    public String toString()
    {
        return super.toString() + " - I am toString()";
    }

    @Override
    public String getMessage()
    {
        return super.getMessage() + " - I am getMessage()";
    }
    
    public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a>9)          
        {

           try {
            throw new ExceptionClass("Number is greater then 9");
           } 
           catch (Exception e) {
              
            System.out.println(e.getMessage());
            System.out.println(e.toString());
           }
        }
    }
}
