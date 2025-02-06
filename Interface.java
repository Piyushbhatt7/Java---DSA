interface A {

    void my();
}

interface B {

    void me();
}



public class Interface implements  A, B{

   public void my()
    {
        System.out.println("Hii");
    }

   public void me()
    {
        System.out.println("Byy");
    }
    
    public static void main(String[] args) {
        
        Interface obj = new  Interface();
        obj.my();
        obj.me();
    }
}
