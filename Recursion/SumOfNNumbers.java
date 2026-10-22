public class SumOfNNumbers 
{
    static int sumOfNNumbers(int n)
    {
        int sum = 0;

        if (n > 0)
            sum = n + sumOfNNumbers(n - 1);

        return sum;
    }

    public static void main(String[] args) 
    {
        System.out.println(sumOfNNumbers(5));
    }
}
