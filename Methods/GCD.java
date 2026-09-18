import java.util.Scanner;

public class GCD
{
    /*static int findGCD(int a, int b)
    {
        int gcd = 1;
        int limit;

        if (a < b)
            limit = a;
        else
            limit = b;

        for (int i = 1; i <= limit; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }

        return gcd;
    }*/

    static int findGCD(int a, int b)
    {
        while (b != 0)
        {
            int rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("GCD = " + findGCD(a, b));

        sc.close();
    }
}