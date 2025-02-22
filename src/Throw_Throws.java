public class Throw_Throws {


    static class NegativeRadiusException extends Exception
    {
       @Override
       public String toString()
       {
        return "Radius cannot be negative";
       }

       @Override
       public String getMessage()
       {
        return "Radius cannot be negative!";
       }
    }

    public static double area(int radius) throws NegativeRadiusException
    {
        if (radius < 0)
        {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * radius * radius;
        return result;
    }
    
    static int divide(int a, int b) throws ArithmeticException 
    {
        // made by harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        
        // porter - uses divide function created by harry
        try {
            int c = divide(6,0);
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
           
            System.out.println("Exception " + e.getMessage());
        }
        
        
    } 
}
