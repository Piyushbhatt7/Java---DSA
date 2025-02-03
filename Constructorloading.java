class Haseena {

    int a, b,c;

    Haseena(int num1, int num2)
    {
        a = num1;
        b = num2;

        c = num1 + num2;
        System.out.println(c);
    }

    Haseena()
    {
        System.out.println("Program finished");
    }
}



public class Constructorloading {

    
    // public Constructorloading()
    // {
    //    super(5,10);
    //    new Haseena();
    // }
    
    public static void main(String args[])
    {
         Haseena obj = new Haseena();
         Haseena obj1 = new Haseena(4,6);
        
         
         
    }
}
