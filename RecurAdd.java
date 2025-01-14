public class RecurAdd {
    
    public static void printAdd(int n)
    {
        if(n == 6)
        {
            return;
        }
            System.out.println(n);
            printAdd(n+1);
    }



    public static void main(String[] args) {
        int n = 1;
        printAdd(n);

    }
}
