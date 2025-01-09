public class NaturalNumber {
    
    public static void printSum (int i, int n, int sum) {
        if(i == n) {

            sum+= i;
            System.out.println(sum);
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static void main(String[] args) {
        
         
    }
}
