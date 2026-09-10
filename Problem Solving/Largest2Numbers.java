import java.util.Scanner;

public class Largest2Numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        if (a>b)
        {
            System.out.println(a + " is largest.");
        }
        else if(b > a)
        {
            System.out.println(b + " is largest.");
        }
        else
        {
            System.out.println("Both are equal.");
        }
    }
}
