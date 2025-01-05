public class StringBuilders {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //  charAt index 0

    //     System.out.println(sb.charAt(0));

    //     // set char at index 0

    //    sb.setCharAt(0, 'P');
    //    System.out.println(sb);

    sb.insert(2, 'n');
    System.out.println(sb);


    // delete the extra 'n'

    sb.delete(2, 3); // non-inclusive
    System.out.println(sb);

    }
}
