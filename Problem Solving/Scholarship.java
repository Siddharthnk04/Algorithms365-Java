import java.util.Scanner;

public class Scholarship 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        

        if (marks >= 85)
        {
            System.out.println("Enter family income : ");
            int income = sc.nextInt();
            if (income <= 200000)
            {
                System.out.println("Eligible for Scholarship.");
            }
            else 
            {
            System.out.println("Not eligible for scholarship.");
            }
        }
        else 
        {
            System.out.println("Not eligible for scholarship.");
        }
    }
}
