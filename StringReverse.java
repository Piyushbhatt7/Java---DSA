public class StringReverse {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Piyush");

        for(int i=0 ;i<sb.length()/2; i++){

            int font = i;
            int back = sb.length() - 1 - i;

            char fontChar  = sb.charAt(font);
            char backChar  = sb.charAt(back);

            sb.setCharAt(font, backChar);
            sb.setCharAt(back, fontChar);
        }

        System.out.println(sb);
    }
}
