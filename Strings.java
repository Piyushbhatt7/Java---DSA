

public class Strings {
    
    public static void main(String[] args) {
        
        // String name = "Kanchana";
        // String fullName = "Tony hulk";
        // String sentence = "HIII hulk and thor and all avengers";
        
        // System.out.print("Enter your name: ");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print("Your name is " + name);

        // CONCATENATION

        // String firstName = "tony";
        // String lastName = "stark";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // to find the length

        // String firstName = "tony";
        // String lastName = "stark";
        // String fullName = firstName + "@" + lastName;
        // System.out.println(fullName.length());

        // // charAt
       
        // for(int i=0;i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }
        
        String name1 = "Tony";
        String name2 = "Tony";
        
        // 1 s1 > s2   + value
        // 2 s1 == s2  0
        // 3 s1 < s2   - ve value
       
        if(name1.compareTo(name2) == 0) {
             System.out.println("Strings are equal");
        }
        else {
            System.out.println("Not equals");
        }

    }
}
