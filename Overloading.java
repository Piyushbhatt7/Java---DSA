class A {

    void fun()
    {
        System.out.println("Hello");
    }

    int fun(int a)
    {
         System.out.println(a);
         return a;
    }
}

public class Overloading  extends A{
    
    public static void main(String args[])
    {
       Overloading obj = new Overloading();
       obj.fun();
       obj.fun(10);
    }
}
