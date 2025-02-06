abstract class Dog {

    abstract void sound();

    void sleeep()
    {
        System.out.println("SLeeping");
    }
 
}

class Animal extends Dog {

    void sound(){
        System.out.println("Bark");
    }
}



public class Abstract {
    
    public static void main(String[] args) {
        Animal obh = new Animal();
        obh.sound();
        obh.sleeep();
    }
}
