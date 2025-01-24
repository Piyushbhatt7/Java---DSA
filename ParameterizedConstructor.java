class ParaConst

{
    String name;
    int id;
    String lastname;

    ParaConst(String name, int id)
    {
        this.name = name;
        this.id = id;

    }

     ParaConst(String lastname)
     {
        this.lastname = lastname;
     }

}




public class ParameterizedConstructor {
    
    public static void main(String[] args) {
        ParaConst obj = new ParaConst("Amit", 2333);
        ParaConst obj1 = new ParaConst("Kumar");
        System.out.println(obj.name + obj.id);
        System.out.println(obj1.lastname);
    }
}
