class Base {

    int i;

}

class SubBaseClass extends Base {

    int i;
    SubBaseClass(int a, int b)
    {
        super.i = a;
        i = b;
    }

    void show()
    {
        System.out.println("i in superclass " + super.i);
        System.out.println("i in sub base class " + i);
    }
}



public class MethodRiding {
    
    public static void main(String[] args) {
        
        SubBaseClass obj = new SubBaseClass(10, 20);
        obj.show();
    }
}
