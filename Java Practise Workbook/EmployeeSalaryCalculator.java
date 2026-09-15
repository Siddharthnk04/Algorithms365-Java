import java.util.Scanner;

public class EmployeeSalaryCalculator 
{
    static int basicSalary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary : ");
        return sc.nextInt();
    }

    static int HRA()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter HRA : ");
        return sc.nextInt();
    }

    static int DA()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary : ");
        return sc.nextInt();
    }

    static int grossSalary()
    {
        return basicSalary() + HRA() + DA();
    }

    public static void main(String[] args) 
    {
        int salary = grossSalary();
        System.out.println("Gross Salary : " + salary);
    }
}
