public class RecurFactorial {
    

   public static int printFactorial(int n)
   {   if(n == 1) {
         return 1;
   }
       int fact = printFactorial(n-1);
       int fact_n = n*fact;
       return  fact_n;
   }


    public static void main(String[] args) {
        
    }
}
