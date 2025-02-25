public class recursion {
    
    public static void main(String[] args) {
        

        static int fact(int n)
        {
          if(n==0 || n==1)
          {
            return 1;
          }
          else{
            return n*fact(n-1);
          }

          return 0;
        }
    }
}
