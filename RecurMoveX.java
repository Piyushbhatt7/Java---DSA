public class RecurMoveX {
    

    // Moving all x in the end "axbcxxd"
     
    public static  void moveAllX(String str, int idx, int count, String newString)
    {
        char currChar = str.charAt(idx);
        if(currChar == 'x')
        {
            count ++;
            moveAllX(str, idx+1, count, newString);
        }
        else{

            newString += currChar;
        }
    }

    public static void main(String[] args) {
        
    }
}
