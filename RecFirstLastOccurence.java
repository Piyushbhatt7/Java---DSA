public class RecFirstLastOccurence {
    
   public static int first = -1;
   public static int last = -1;

   public static void findOccurance(String str, int idx, char element)
   {
     char currChar = str.charAt(idx);
     if(currChar == element)
     {
        if(first == -1)
        {
            first = idx;
        }  
     }
   }


    public static void main(String[] args) {
        

    }
}
