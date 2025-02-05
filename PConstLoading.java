class Call {

    Call()
    {
        System.out.println("Great");
    }

    Call(int a)
    {
        System.out.println(a);
    }
}


public class PConstLoading {
    
    public static void main(String[] args) {
        
        Call obj = new Call();
        Call obj1 = new Call(23);
    }
}
