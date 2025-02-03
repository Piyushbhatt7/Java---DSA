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
        A obj = new A();
         Overriding onj = new Overriding();
         obj.fun();
         onj.fun();
        
    }
}
