public class PrimeBelow {
    
    public static void main(String[] args) {
        

        for(int i=2; i<=100;)
        {
            int primev = 1;

            for(int loop=2; loop<=i; loop++)
            {
                if((i % loop) == 0 && loop!=i)
                {
                    primev = 0;
                }
            }

            if(primev != 0)
            {
                System.out.println(i + " is a prime number");
                i++;
            }
            else {
                i++;
            }
        }
    }
}
