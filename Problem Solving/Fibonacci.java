import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n == 0)
        {
            System.out.println(0);
            return;
        }
        if (n == 1)
        {
            System.out.println(1);
            return;
        }

        int fib1 = 0;
        int fib2 = 1;

        //System.out.println(fib1);
        //System.out.println(fib2);

        /*for (int i = 3; i <= 10; i++)
        {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;

            System.out.println(fib);
        }*/

        for(int i = 2; i <= n; i++)
        {
            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
            
        }

        System.out.println(fib2);
    }
}
