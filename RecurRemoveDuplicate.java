public class RecurRemoveDuplicate {
    
    // Removing dublicate from sting = "abbccda"
    
     public static boolean [] map = new boolean[26];

     public static void removeDuplicates(String str, int idx, String newString) {

        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true) {
             
            removeDuplicates(str, idx+1, newString);

        }
     }



    public static void main(String[] args) {
        
    }
}
