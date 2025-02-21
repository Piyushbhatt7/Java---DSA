abstract class Base1 {

    public Base1()
    {
        System.out.println("Base 1 constructor");
    }

    public void sayHello()
    {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Base2 extends Base1 {

    @Override
    public void greet()
    {
        System.out.println("Ne hoa");
    }
}

public class AbstractClass {
    
    public static void main(String args[])
    {
        // existing in thought or as an idea but not having a physical or concrete existence.
         

        // abstract method is declared without an implementation

        // abstract void moveTo(double x, double y);

        // abstract class
        // if a class includes abstract method, then the class itself must be declared abstract, as in:

        // public abstract class PhoneModel {
        //   abstract void switchoff();
        // }
    }
   
}
