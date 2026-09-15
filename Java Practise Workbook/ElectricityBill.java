import java.util.Scanner;

public class ElectricityBill 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units : ");
        int units = sc.nextInt();

        int bill;

        if (units <= 100)
            bill = units * 3;
        else if (units <= 200)
            bill = (100 * 3) + (units - 100) * 5;
        else if (units <= 300)
            bill = (100 * 3) + (100 * 5) + ((units - 200) * 7);
        else
            bill = (100 * 3) + (100 * 5) + ((100 * 7) + (units - 300) * 10);

        System.out.println("Bill : " + bill);
    }
}
