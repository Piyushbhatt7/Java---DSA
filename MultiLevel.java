class A {
    int x;
    int y;

    int get(int p, int q)
    {
        x=p;
        y=q;
        return 0;
    }

    void show()
    {
        System.out.println(x);
    }
}

class B extends A{

    void showB()
    {
        System.out.println("B");
    }
}


public class MultiLevel extends B
{ 
    void display()
    {
        System.out.println("C");
    }

    public static void main(String[] args) {
        
        A obj = new A();
        obj.get(20, 30);
        obj.show();
    }

}