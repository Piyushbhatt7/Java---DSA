public class RecFirstLastOccurence {
    
   public static int first = -1;
   public static int last = -1;

   public static void findOccurance(String str, int idx, char element)
   {

    if(idx == str.length())
    {
        
    }


     char currChar = str.charAt(idx);
     if(currChar == element)
     {
        if(first == -1)
        {
            first = idx;
        }
        else{
            last = idx;
        }  
     }

     findOccurance(str, idx+1, element);
   }


    public static void main(String[] args) {
        

    }
}
