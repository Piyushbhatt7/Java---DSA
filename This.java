class Ex {

    String name;

    Ex(String name)
    {
        this.name = name;
    }

    void display()
    {
        System.out.println(name);
    }
}


public class This {
    
    public static void main(String[] args) {
        
        Ex obj = new Ex("Piyush");
        obj.display();
    }
}
