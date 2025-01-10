public class Const {
    
 int age, id;
 String name;

  Const(int a, String n) {
     
       age = a;
       name = n;
  }

  Const(int i) {
     
    id = i;
  }

  Const(int i, String n, int a) {
     
    age = a;
    name = n;
    id = i;
  }

  void display() {

    System.out.println(name + "\n" + age + "\n" + id);
  }


    public static void main(String[] args) {
        
        Const obj = new Const(10623, "Piyush", 20);
        obj.display();
    }
}
