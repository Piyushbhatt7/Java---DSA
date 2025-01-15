public class RecurLogN {
    
    public static int calculatePower(int x, int n)
    {   
     
 
     if (n == 0) {
 
         return 1;
     }
 
 
     if(x == 0) 
     {
         return 0;
     }
        
       // if  n is even

       if(n%2==0)
       {
         return  calculatePower(x, n/2) * calculatePower(x, n/2);
       }
       else{

        return calculatePower(x, n/2) 
       }
    }




    public static void main(String[] args) {
        

    }
}
