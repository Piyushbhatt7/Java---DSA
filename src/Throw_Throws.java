public class Throw_Throws {
    
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
        catch (Exception e) {
           
            System.out.println("Exception");
        }
        
        
    }
}
