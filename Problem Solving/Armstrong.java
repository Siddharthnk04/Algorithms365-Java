import java.util.Scanner;

public class Armstrong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        //Finding count
        // int count = String.valueOf(num).length();
        // System.out.println(count);

        int count = 0;
        int temp = num;
        for (;temp > 0;)
        {
            count++;
            temp/=10;
        }

        temp = num;
        int result = 0;

        while (num > 0)
        {
            int digit = num%10;
            for(int i = 1; i < count; i++)
            {
                digit *= num%10;
            }
            result += digit;
            num/=10;
        }
        
        if (result == temp)
            System.out.println("Armstrong.");
        else
            System.out.println("Not ARmstrong.");
    }
}
