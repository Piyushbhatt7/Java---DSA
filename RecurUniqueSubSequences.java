public class RecurUniqueSubSequences {
   
    public static void UniqueSequence(String str, int idx, String newString) {
        

        char currChar = str.charAt(idx);
        UniqueSequence(str, idx+1, newString + currChar);

        UniqueSequence(str, idx, newString);
    }


    public static void main(String[] args) {
        
    }
}
