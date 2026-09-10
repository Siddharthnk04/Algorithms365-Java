import java.util.Scanner;

public class LoopActiviyies2 
{
    public static void main(String[] args) 
    {
        //Multiple of 5
        //for loop
        /*for(int i = 1; i<=10;i++)
        {
            System.out.println(5*i);
        }

        //while
        int start = 1;
        while(start<=10)
        {
            System.out.println(5*start);
            start+=1;
        }

        //do while
        start = 1;
        do
        {
            System.out.println(5*start);
            start++;
        } while(start<=10);*/

        //Multiplication table
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++)
        {
            System.out.println(n + " * " + i + " = " + i*n);
        }


        int i = 1;
        while(i<=10)
        {
            System.out.println(n + " * " + i + " = " + i*n);
            i++;
        }

        i = 1;
        do
        {
            System.out.println(n + " * " + i + " = " + i*n);
            i++;
        }while(i<=10);*/

        //1, 10, 100, 1000, 10000
        /*int start = 1;
        int end = 10000;

        for (;start<=10000;start*=10)
        {
            System.out.println(start);
        }

        start = 1;
        while(start <= end)
        {
            System.out.println(start);
            start*=10;
        }

        start = 1;
        do
        {
            System.out.println(start);
            start *= 10;

        }while(start<=end);*/

        //Power of 2
        /*for(int start = 1; start <= 64; start*=2)
        {
            System.out.println(start);
        }

        int start = 1;
        while (start <= 64)
        {
            System.out.println(start);
            start *= 2;
        }

        start = 1;
        do
        {
            System.out.println(start);
            start *= 2;
        }while(start <= 64);*/

        //64, 32, 16, 8, 4, 2, 1
        /*for(int i = 64; i >= 1; i/=2)
        {
            System.out.println(i);
        }

        int start = 64;
        while (start >= 1)
        {
            System.out.println(start);
            start/=2;
        }

        start = 64;
        do
        {
            System.out.println(start);
            start /= 2;

        } while (start >= 1);*/

        //100, 90, 80, 70, 60, ...
        /*for(int start = 100; start >= 10; start -= 10)
        {
            System.out.println(start);
        }

        int start =100;
        while (start >= 10)
        {
            System.out.println(start);
            start -= 10;
        }

        start = 10;
        do
        {
            System.out.println(start);
            start -= 10;
        } while (start >= 10);*/

        //Tables 1 to 10
        for(int start = 1;start <= 10; start++)
        {
            for(int end = 1; end<=10; end++)
            {
                System.out.printf("%4d",end*start);
            }
            System.out.println();

        }
    } 
}
