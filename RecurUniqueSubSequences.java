public class RecurUniqueSubSequences {
   
    public static void UniqueSequence(String str, int idx, String newString) {
        
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
        UniqueSequence(str, 0, "");
    }
}
