import java.util.Scanner;

public class UserLoginSystem 
{
    static boolean checkLogin(String usn, String pass)
    {
        if (usn.equals("admin") && pass.equals("java123"))
            return true;
        return false;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int attempts = 3;

        while (attempts > 0)
        {
            System.out.print("Enter Username : ");
            String usn = sc.nextLine();

            System.out.print("Enter Password : ");
            String password = sc.nextLine();

            if (checkLogin(usn, password))
            {
                System.out.println("Login Success...");
                break;
            }
            else
            {
                System.out.println("Login Failed...");
                System.out.println("Incorrect Username or Password...");
                attempts--;
                System.out.println(attempts + " attempts left.");
            }
        }

        if (attempts == 0)
        {
            System.out.println("No more attempts left!!!");
        }
    }
}
