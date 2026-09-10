import java.util.*;

public class CollegeAdmission 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();


        System.out.println("Enter Pass or Fail : ");
        String result = sc.next();

        if (marks >= 85 && result.equals("Pass"))
        {
            System.out.println("Can be admitted");
        }
        else
        {
            System.out.println("Cannot be admitted");
        }
    }
}
