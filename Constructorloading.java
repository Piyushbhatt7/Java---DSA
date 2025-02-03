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



public class Constructorloading  extends Haseena{

    
    // public Constructorloading()
    // {
    //    super(5,10);
    //    new Haseena();
    // }
    
    public static void main(String args[])
    {
         Constructorloading obj = new Constructorloading();
         
         
    }
}
