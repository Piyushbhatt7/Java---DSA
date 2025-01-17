public class RecuerStringReverse {
    
    public static void printReverse(String str, int ind)
    {
        if(ind == 0)
        {
            System.out.println(str.charAt(ind));
            return;
        }
        System.out.print(str.charAt(ind));

        
        printReverse(str, ind-1);
    }

    public static void main(String[] args) {
        
        String str = "abcd";
        printReverse(str, str.length()-1);

    }
}
