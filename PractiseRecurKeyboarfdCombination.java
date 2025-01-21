public class PractiseRecurKeyboarfdCombination {
    
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static void printCombination(String str, int idx, String combination)
    {

        if(idx == str.length())
        {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++)
        {
            printCombination(str, idx+1, combination + mapping.charAt(i));
        }
    }



    public static void main(String[] args) {
        
        String str = "22";
        printCombination(str, 0, "");
    }
}
