public class NaturalNumber {
    
    public static void printSum (int i, int n, int sum) {

        sum += i;
        printSum(i+1, n, sum);
    }

    public static void main(String[] args) {
        
         
    }
}
