class Test {

    void Demo()
    {
        System.out.println("No parameters");
    }

    void Demo(int a)
    {
        System.out.println("a: " + a);
    }

    void Demo(int a, int b)
    {
        System.out.println("a: " + a + "b: " + b);
    }

    double Demo(double a)
    {
        System.out.println("a " + a);
        return a*a;
    }
}


public class MethodOverloading {
    
    public static void main(String[] args) {
        
        Test obj = new Test();
        obj.Demo();
        obj.Demo(20);
        obj.Demo(10, 30);
        double result = obj.Demo(53.45);

        System.out.println(obj.Demo(53.45) + result);
    }
    
    

}
