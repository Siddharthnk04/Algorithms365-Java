public class EmployeeSalary 
{
    static void calculateBasic()
    {
        System.out.println("Basic Calculated");
    }

    static void calculateHRA()
    {
        calculateBasic();
        System.out.println("HRA done");
    }

    static void calculateDA()
    {
        calculateHRA();
        System.out.println("DA done");
    }

    static void calculateTax()
    {
        calculateDA();
        System.out.println("Tax Done");
    }

    static void calculateSalary()
    {
        calculateTax();
        System.out.println("Final Salary");

    }
    public static void main(String[] args) 
    {
        calculateSalary();
    }
}
