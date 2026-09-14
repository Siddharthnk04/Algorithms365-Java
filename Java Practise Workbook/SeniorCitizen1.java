
import java.util.Scanner;

public class SeniorCitizen1 
{
    static void senior(int age)
    {
        if (age >= 60)
            System.out.println("Senior Citizen");
        else
            System.out.println("Not a Senior Citizen");
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();

        senior(age);
    }
}
