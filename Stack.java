
class Pop {

    int stack[] = new int[10];
    int tos;

     Pop()
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
    
        int pop() {
            if(tos < 0) {
                System.out.println("Stack underflow");
                return 0;
            } else {
                return stack[tos--];
            }
        } 
}


public class Stack {
    
    public static void main(String[] args) {
        
        Pop mypop1 = new Pop();
        Pop mypop2 = new Pop();
        
    }
}
