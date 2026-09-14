import java.util.Scanner;

public class BankLoan 
{
    boolean loanApproval (int age, int salary)
    {
        if (age >= 21 && salary >= 35000)
            return true;
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter Salary : ");
        int salary  =sc.nextInt();

        BankLoan obj = new BankLoan();

        if(obj.loanApproval(age, salary))
            System.out.println("Loan Approved");
        else
            System.out.println("Loan Rejected");
    }
}
