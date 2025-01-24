class ParaConst

{
    String name;
    int id;

    ParaConst(String name, int id)
    {
        this.name = name;
        this.id = id;

    }

     ParaConst(String lastname)
     {
        String lname = lastname;
     }

}




public class ParameterizedConstructor {
    
    ParaConst obj = new ParaConst("Amit", 2333);
    ParaConst obj1 = new ParaConst("Kumar");
    System.out.println(obj.name + obj.id);
    System.out.println(obj1.lname);
}
