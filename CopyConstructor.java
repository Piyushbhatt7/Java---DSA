class Copy {

    int id;
    String name;

      Copy(int id, String name) 
 {
         this.id = id;
         this.name = name;
    }

    Copy(Copy obj)
    {
        this.id = obj.id;
        this.name = obj.name;
    }

    
}


public class CopyConstructor {
    
    public static void main(String[] args) {
        
        Copy obj1 = new Copy(623, "Piyush");
        Copy obj2 = new Copy(obj1);
        System.out.println(obj2.id + " " + obj2.name);
    }
}
