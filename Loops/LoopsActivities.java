import java.util.*;

public class LoopsActivities 
{
    public static void main(String[] args) {
        //Increment by 3
        /*for(int i = 1; i<=20;i+=3)
        {
            System.out.println(i);
        }*/

        // Decrement by 5
        /*System.out.println("Decrement by 5 ");
        for(int i = 50; i >= 0; i-=5)
        {
            System.out.println(i);
        }*/

        //Reverse Alphabet
        /*for(char ch = 'Z'; ch >= 'A'; ch--)
        {
            System.out.println(ch);
        }*/

        //1 to 100
        /*for (int i =1; i<=100; i++)
        {
            System.out.println(i);
        }*/

        //Multiples of 5
        /*for (int i =5; i<=500; i+=5)
        {
            System.out.println(i);
        }*/

        //Squares of numbers 1 to 10
        /*for (int i =1; i<=10; i++)
        {
            System.out.println(i + " -> " + i*i);
        }*/

        //Cubes of numbers 1 to 10
        /*for (int i =1; i<=10; i++)
        {
            System.out.println(i + " -> " + i*i*i);
        }*/

        //Sum fo first n numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i =1; i<=n; i++)
        {
            sum += i;
        }

        System.out.println("Sum : " + sum);
    }
}
