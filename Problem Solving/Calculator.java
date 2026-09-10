import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Menu");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("REM");
        String operator = sc.next();

        switch (operator.toUpperCase())
        {
            case "ADD":
                System.out.println(a+b);
                break;
            
            case "SUB":
                System.out.println(a-b);
                break;

            case "MUL":
                System.out.println(a*b);
                break;

            case "DIV":
                System.out.println(a/b);
                break;

            case "REM":
                System.out.println(a%b);
                break;

            default:
                System.out.println("Invalid Operator!!!");
        }
    }
}
