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

    void showDetails()
    {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class PSuper {
    
    public static void main(String[] args) {
         Child c = new Child(101, "Piyush");
         c.showDetails();
         // c.showId();
    }
}
