class Parent {

    int id;
    Parent(int id)
    {
        this.id = id;
    }

    void showId()
    {
        System.out.println("Id " + id);
    }
}

class Child extends Parent {

    String name;

    Child(int id, String name)
    {
        super(id);
        this.name = name;
    }
}

public class PSuper {
    
    public static void main(String[] args) {
        
    }
}
