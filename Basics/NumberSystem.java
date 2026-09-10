import java.util.*;

public class NumberSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = sc.nextLine();

        boolean binary = true;
        boolean decimal = false;
        boolean hexaDecimal = false;

        if (num.charAt(1) == 'x' || num.charAt(1)=='X')
        {
            hexaDecimal = true;
        }
        else
        {
            for (int i = 0;i < num.length();i++)
            {
                char ch = num.charAt(i);

                if (ch == '8' || ch == '9')
                {
                    decimal = true;
                    binary = false;
                    break;
                }

                if (ch!='1' && ch!='0')
                {
                    binary=false;
                }
            }
        }

        if(hexaDecimal)
        {
            System.out.println("Hexa Decimal");
            System.out.println("Radix : 16");
        }
        else if(decimal)
        {
            System.out.println("Decimal");
            System.out.println("Radix : 10");
        }
        else if(binary)
        {
            System.out.println("Binary");
            System.out.println("Radix : 2");
        }
        else
        {
            System.out.println("Octal");
            System.out.println("Radix : 8");
        }
    }
}
