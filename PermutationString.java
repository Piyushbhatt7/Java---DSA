public class PermutationString {
    
    public static void printPermutation(String str, String permu)
    {   

        if(str.length() == 0)
        {
            System.out.println(permu);
            return;
        }

vf
        for(int i=0; i<str.length(); i++)
        {

            char currChar = str.charAt(i);
            // abc -> "bc" -> 
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, permu + currChar);
        }
    }
    
    
    public static void main(String[] args) {
        
        String str = "abc";
        printPermutation(str, "");
    }
}
