import java.util.Scanner;

public class StudentPassFail2 
{
    static void passFail(int marks)
    {
        if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        passFail(marks);
    }
}
