public class Recursion_problem3 {
    
    static int sumRect(int n)

    {
        if(n==1)
        {
            return 1;
        }

        else {
            return n + sumRect(n-1);
        }
    }
    public static void main(String[] args) {
        
    }
}
