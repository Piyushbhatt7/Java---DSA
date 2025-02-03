interface A {

    public void show();
   
}

interface B {

     public void display();\
}


public class MultipleInheritance implements A, B {
   // @Override
    public void show() {
        System.out.println("Show method from interface A");
    }

   // @Override
    public void display() {
        System.out.println("Display method from interface B");
    }
    
    public static void main(String[] args) {

        MultipleInheritance obj = new MultipleInheritance();
        obj.show();
        obj.display();
        
    }
}
