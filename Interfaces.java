interface A{

    void fun();
}

interface B 
{
    void sum();
}

class Interfaces implements A,B{

    public void fun()
         {
            System.out.println("Fun executed");
         }

         public void sum()
         {
            System.out.println("Sum executed");
         }

    public static void main(String[] args) {
        
         Interfaces obj = new Interfaces();
         obj.fun();
         obj.sum();
    }
}