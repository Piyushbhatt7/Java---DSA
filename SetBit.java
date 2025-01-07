public class SetBit {
    
    public static void main(String[] args) {
        
        int n = 5;
        int position = 1;

        int bitMask = 1<<position;

         if((bitMask | n) == 0) {

            System.out.println("0");
         }
         else{
            System.out.println("1");
         }
    }
}
