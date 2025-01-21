public class RecurKeyboarfdCombination {
    
   public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

   public static void printCombinattions(String str, int idx, String combination) {
      
    if(idx == str.length())
    {
        System.out.println(combination);
        return;
    }

       char currchar = str.charAt(idx);
       String mapping = keypad[currchar - '0'];

       for(int i=0; i<mapping.length(); i++)
       {
          printCombinattions(str, idx+1, combination + mapping.charAt(i));
       }
   }



    public static void main(String args[])
    {
        String str = "23";
        printCombinattions(str, 0, "");
    }
}
