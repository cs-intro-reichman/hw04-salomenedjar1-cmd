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
        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;
        for (int i = 2; i <= n; i++) 
        {
            if (isPrime[i]) 
            {
                System.out.println(i);
                count++;
            }
        }

        int percentage = (int) Math.round((count * 100.0) / n);

        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percentage + "% are primes)");
    }

}