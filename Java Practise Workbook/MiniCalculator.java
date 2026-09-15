
import java.util.Scanner;

public class MiniCalculator 
{
    static int add(int a, int b)
    {
        return a + b;
    }

    static int sub(int a, int b)
    {
        return a - b;
    }

    static int mul(int a, int b)
    {
        return a * b;
    }

    static double div(double a, int b)
    {
        return a / b;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ===== Calculator =====");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");

        System.out.println("Choose Operation : ");
        String choice = sc.nextLine();

        choice = choice.toUpperCase();

            
        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        switch (choice)
        {
            case "ADD" :
                System.out.println(add(a,b));
                break;

            case "SUB" :
                System.out.println(sub(a,b));
                break;

            case "MUL" :
                System.out.println(mul(a,b));
                break;

            case "DIV" :
                System.out.println(div(a,b));
                break;

            default:
                System.out.println("Invalid Operation !!!");
        }
    }
}
