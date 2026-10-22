public class PowerOfNumber 
{
    static int powerOfNumber(int n, int k)
    {
        if (k == 0)
            return 1;

        return n * powerOfNumber(n, k - 1);
    }

    public static void main(String[] args) 
    {
        System.out.println(powerOfNumber(2, 5));
        System.out.println(powerOfNumber(3, 5));

    }
}
