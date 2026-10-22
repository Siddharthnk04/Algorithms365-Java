public class ReverseANumber 
{
    static int reverseNumber(int n)
    {
        if (n < 10)
            return n;

        int countPlace = countDigits(n);
        return (n % 10) * (countPlace) + reverseNumber(n / 10);
    }

    static int countDigits(int n)
    {
        if (n < 10)
            return 1;

        return 10 * countDigits(n / 10);
    }

    static int revNumber(int n)
    {
        if (n < 10)
            return n;

        int digits = (int) Math.log10(n);
        return (n % 10) * (int)(Math.pow(10, digits)) + reverseNumber(n / 10);
    }

    public static void main(String[] args) 
    {
        System.out.println(reverseNumber(2658));
        System.out.println(revNumber(2658));
    }
}
