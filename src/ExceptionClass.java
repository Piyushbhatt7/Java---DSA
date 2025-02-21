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
        if(a>99)
        {
            
        }
    }
}
