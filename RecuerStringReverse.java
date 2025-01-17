public class RecuerStringReverse {
    
    public static void printReverse(String str, int ind)
    {
        System.out.println(str.charAt(ind));
        printReverse(str, ind-1);
    }

    public static void main(String[] args) {
        

    }
}
