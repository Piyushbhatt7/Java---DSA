class Constructor{
    
    Constructor()
    {
        System.out.println("hii");
    }

    Constructor(String a)
    {
        String name  = a;
        System.out.println(name);
    }
}

public class ConstructorOverloading {
    
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        Constructor obj1 = new Constructor("Users");
    }
}
