
import java.util.Scanner;

public class Countdown 
{
    void countdown(int n)
    {
        while (n > 0)
        {
            System.out.print(n + " ");
            n--;
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        Countdown obj  = new Countdown();
        obj.countdown(n);
    }
}
