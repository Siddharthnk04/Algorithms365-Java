import java.util.Scanner;

public class Fib 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;
        

        for(int i = 0; i <= n; i++)
        {
            if (i == 0)
                System.out.println(a);
            else if (i == 1)
                System.out.println(b);
            else
            {
                c = a + b;
                a = b;
                b = c;

                System.out.println(c);
            }
        }        
    }
}
