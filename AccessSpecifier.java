class Test {

    int a;
    public int b;
    private int c;


    void setc(int i)
    {
        c=i;
    }

    int getc()
    {
        return c;
    }
}



public class AccessSpecifier {
    
    public static void main(String[] args) {
        
        Test obj = new Test();
        obj.a = 1;
        obj.b = 5;
        // obj.c error
        obj.setc(300);
        System.out.println("a,b and c: " + obj.a+ " " + obj.b + " " + obj.getc());
    }
}
