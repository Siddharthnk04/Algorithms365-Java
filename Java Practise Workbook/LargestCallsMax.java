import java.util.Scanner;

public class LargestCallsMax 
{
    int largest(int a, int b, int c)
    {
        int large = max(a, b);
        return max(large,c);
    }

    int max(int a, int b)
    {
        if (a > b)
            return a;
        return b;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        System.out.print("Enter a number : ");
        int b = sc.nextInt();

        System.out.print("Enter a number : ");
        int c = sc.nextInt();

        LargestCallsMax o = new LargestCallsMax();

        System.out.println(o.largest(a,b,c));
    }
}
