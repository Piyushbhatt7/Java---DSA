public class NestesdTryCatch {
    
    public static void main(String[] args) {

        int marks[] = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 12;
        
        try {
            
            System.out.println("WElcome to nested try catch");

            try {
                
            } 
            catch (Exception e) {
            }
        } 
        catch (Exception e) {

            System.out.println("Exception in level 1");
        }
    }
}
