public class Recursion3 {

    public static int callGuests(int n)
    {

        
        // single
        int ways1 = callGuests(n-1);

        // duble

        int ways2 = (n-1) * callGuests(n-2);

        return ways1 + ways2;

    }
    
    public static void main(String[] args) {
        
    }
}
