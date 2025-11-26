public class Primes {
    public static void main(String[] args) 
    {
        int n= Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n+1];
        isPrime[1]= false;
        isPrime[0]= false;

        for (int i = 2; i <= n; i++)
            isPrime[i]= true;

        int current = 2;

        while (current * current <= n) 
        {
            if (isPrime[current]) 
            {
                int multiple = current * current;
                while (multiple <= n) 
                {
                    isPrime[multiple] = false;
                    multiple += current;
                }
            }

            current++;
        }


    }
}