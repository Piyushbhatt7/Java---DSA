public class PracticeSet {
    
    public static void main(String[] args) {
        
        // problem 1
        // Syntax Error - int a = 7
        // int age = 78;
        // Logical Error - int year_born = 2000-78;
        System.out.println(6/0);

        // problem 2

        try {
            int a = 66/9;

        } 
        catch (IllegalArgumentException e) {
             System.out.println("haha");
        }
        catch(ArithmeticException e)
        {
            System.out.println("hhehe");
        }

    }
}
