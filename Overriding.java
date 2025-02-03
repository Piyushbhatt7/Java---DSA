class A{
    
    void fun()
    {
        System.out.println("Hello");
    }

    
}


public class Overriding extends A{

    void fun()
    {
        System.out.println("World");
    }
    
    public static void main(String args[])
    {
         A onj = new A();
         onj.fun();
    }
}
