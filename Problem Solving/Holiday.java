import java.util.Scanner;

public class Holiday 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day : ");
        String day = sc.nextLine();

        if(day.equals("Saturday") || day.equals("Sunday"))
        {
            System.out.println("Holiday");
        }
        else
        {
            System.out.println("Workday");
        }
    }
    
}
