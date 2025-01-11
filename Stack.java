
class Stack {

    int stack[] = new int[10];
    int tos;

     Stack()
      {

        tos = -1;
    }
    
    void push(int item) {
        if(tos==9)
        {
            System.out.println("Stack is full");
        }

        else {
            stack[++tos] = item;
        }
    }

    
    
}



public class Stack {
    
    public static void main(String[] args) {
        
    }
}
