class My {

   void ride()
    {
        System.out.println("I am");
    }
}

class You extends  My{

    void ride()
    {
        System.out.println("Ridding");
    }
}


public class PMethodRide {
    
    public static void main(String[] args) {
        
        My ob = new My();
        You obj = new You();
        ob.ride();
        obj.ride();
    }
}
