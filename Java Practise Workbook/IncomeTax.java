
import java.util.Scanner;

public class IncomeTax 
{
    static void incomeTax(int income)
    {
        if (income >= 1200000)
            System.out.println("30% tax");
        else if (income >= 500000)
            System.out.println("20% tax");
        else 
            System.out.println("10% tax");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        int income = sc.nextInt();

        incomeTax(income);


    }
}
