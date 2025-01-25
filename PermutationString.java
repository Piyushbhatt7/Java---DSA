public class PermutationString {
    
    public static void printPermutation(String str, String permu)
    {
        for(int i=0; i<str.length(); i++)
        {

            char currChar = str.charAt(i);
            // abc -> "bc" -> 
            String newStr = str.substring(0, i) + str.substring(i+1);
            
        }
    }
    
    
    public static void main(String[] args) {
        
    }
}
