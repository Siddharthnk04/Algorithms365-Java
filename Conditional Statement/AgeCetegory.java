import java.util.Scanner;

public class AgeCetegory 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        if (age < 13 && age >0)
        {
            System.out.println("Child");
        }
        else if (age > 12 && age < 18)
        {
            System.out.println("Teenager");
        }
        else if (age >= 18 && age < 60)
        {
            System.out.println("Adult");
        }
        else if (age > 60)
        {
            System.out.println("Senior Citizen");
        }
        else 
        {
            System.out.println("Invalid");
        }
    }
}
