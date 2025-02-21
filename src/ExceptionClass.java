
import java.lang.classfile.Superclass;

public class ExceptionClass  extends Exception{

    @Override
    public String toString()
    {
        return super.toString() + "I am toString()";
    }

    public String getMessage()
    {
        return Superclass.getMessage() + "I am getMessage()";
    }
    
    public static void main(String[] args) {
        
    }
}
