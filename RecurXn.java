public class RecurXn {
    
   public static int calculatePower(int x, int n)
   {   
    

    if (n == 0) {

        return 1;
    }


    if(x == 0) 
    {
        return 0;
    }
       int xPower = calculatePower(x, n-1);
       int xPow = x * xPower;
       return xPow;
   }



    public static void main(String[] args) {
        
        int x = 2;
        int n = 5;
        int ans = calculatePower(x, n);
        System.out.println(ans);
    }
}
