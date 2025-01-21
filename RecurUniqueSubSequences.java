
import java.util.HashSet;

public class RecurUniqueSubSequences {
   
    public static void UniqueSequence(String str, int idx, String newString, HashSet<String> set) {
        
        if( idx == str.length())
        {
            System.err.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        UniqueSequence(str, idx+1, newString + currChar);

        UniqueSequence(str, idx+1, newString);
    }


    public static void main(String[] args) {
        
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        UniqueSequence(str, 0, "");
    }
}
