
import java.util.Scanner;

public class ExceptionClass  extends Exception{

    @Override
    public String toString()
    {
        return super.toString() + "I am toString()";
    }

    @Override
    public String getMessage()
    {
        return super.getMessage() + "I am getMessage()";
    }
    
    public static void main(String[] args) {
        
        int a = 8;
        Scanner sc = new Scanner(System.in);
        if(a>9)
        {
            throw new ExceptionClass("")
        }
    }
}
