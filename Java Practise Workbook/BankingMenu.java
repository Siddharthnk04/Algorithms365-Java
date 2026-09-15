import java.util.Scanner;

public class BankingMenu 
{
    static void checkBalance(int balance)
    {
        System.out.println("Balance : " + balance);
    }

    static int deposit(int balance)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit : ");
        balance += sc.nextInt();
        System.out.println("Deposit Successful...");
        return balance;
    }

    static int withdraw(int balance)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw : ");
        balance -= sc.nextInt();
        System.out.println("Withdraw Successful...");
        return balance;
    }

    public static void main(String[] args) 
    {
        int balance = 1000000;
        int choice;

        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println();
            System.out.println("===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice [1, 2, 3, 4] : ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1 :
                    checkBalance(balance);
                    break;
                
                case 2 :
                    balance = deposit(balance);
                    break;

                case 3 :
                    balance = withdraw(balance);
                    break;

                case 4 :
                    System.out.println("Thank You !!!");
                    break;

                default:
                    System.out.println("Invalid!!   Please enter [1, 2, 3, 4]");
            }
        } while (choice != 4);
    }
}
