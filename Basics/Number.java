import java.util.Scanner;

public class Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        /*while(num > 0)
        {
            System.out.println(num%10);
            num/=10;
        }*/

        //Using for loop 
        /*for(;num>0;)
        {
            System.out.println(num%10);
            num/=10;
        }*/

        int reverse = 0;
        while(num > 0)
        {
            reverse = reverse*10 + (num%10);
            num/=10;
        }

        while (reverse > 0)
        {
            System.out.println(reverse%10);
            reverse/=10;
        }
    }
}
