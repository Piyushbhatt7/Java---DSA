abstract class Shape
{
    double height;
    double width;

    Shape(double a, double b)
    {
        height = a;
        width = b;

    }

    abstract double area();
}


class Rectangle extends Shape
{
    Rectangle(double a, double b)
    
    {
        super(a, b);
    }

    double area()
    {
        System.out.println("Area of rectangle ");
        return height * width;
    }
}

class Triangle extends Shape
{
    Triangle(double a, double b)
    {
        super(a,b);

    }

    double area()
    {
        System.out.println("Inside are of Triangle: ");
        return height * width / 2;
    }
}




public class AbstractPractise {
    
    public static void main(String args[])
    {

        Rectangle ob = new Rectangle(10, 5);
        Triangle obj = new Triangle(10, 8);

        Shape i;
        i = ob;

        System.out.println("Area is : " + i.area());
        i = obj;
        System.out.println("Area is : " + i.area());


    }
}
