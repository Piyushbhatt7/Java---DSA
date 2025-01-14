public class RecurXn {
    
   public static int calculatePower(int x, int n)
   {
       int xPower = calculatePower(x, n-1)
       int xPow = x * xPower;
       return xPow;
   }



    public static void main(String[] args) {
        
    }
}
