import java.util.Scanner;

public class UserLogin 
{
    boolean loginCheck (String usn, String pass)
    {
        if (usn.equals("admin") && pass.equals("java123"))
            return true;
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String usn = sc.nextLine();

        System.out.print("Enter Password : ");
        String pass = sc.nextLine();

        UserLogin obj = new UserLogin();

        if (obj.loginCheck(usn, pass))
            System.out.println("Login Successful");
        else
            System.out.println("Unsuccessful, Try Again !!!");
    }
}
