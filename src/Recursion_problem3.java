public class Recursion_problem3 {
    
    // fibonnacci series using recursion
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
        
        int n = sumRect(5);
        System.out.println(sumRect(n));
    }
}
