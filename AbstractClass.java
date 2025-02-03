abstract class A{

    abstract void callme();
    void callmetoo()
    {
        System.out.println("This is concreate method");
    }
}


class B extends A
{
    void callme()
    {
       System.out.println("B is implemented successfully");
    }
}

public class AbstractClass {
    
    public static void main(String args[])
    {
        B obj = new B();
        obj.callme();
        obj.callmetoo();
    }
}
