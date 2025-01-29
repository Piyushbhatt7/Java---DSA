public class StaticPractise {
    
    static int a = 42;
    static int b = 99;

    static void callme()
    {
        System.out.println("a = " + a);
    }


    public static void main(String[] args) {
        
        StaticPractise.callme();
        System.out.println("b = " + StaticPractise.b);
    }
}
