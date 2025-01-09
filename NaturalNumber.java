public class NaturalNumber {
    
    public static void printSum (int i, int n, int sum) {

        sum += i;
        printSum(+1, n, sum);
    }

    public static void main(String[] args) {
        
         
    }
}
