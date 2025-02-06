class Var {

    String name = "Piyush";

}

class Vur extends Var {
    
    String name = "Bhatt";
    void my()
    {
        System.out.println(super.name);
        System.out.println(name);
    }
}


public class SuperVariable {
    
    Vur obj = new Vur();
    obj.my();
}
