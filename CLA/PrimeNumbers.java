public class PrimeNumbers 
{
    static boolean isPrime(int num)
    {
        for (int i = 2; i < num/2; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) 
    {
        for (String x : args)
        {
            if (isPrime(Integer.parseInt(x)))
            {
                System.out.print(x + " ");
            }
        }
    }
}
