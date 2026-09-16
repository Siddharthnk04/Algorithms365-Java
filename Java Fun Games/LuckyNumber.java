import java.util.Scanner;

public class LuckyNumber 
{
    static boolean validName(String name)
    {
        name = name.trim();

        if(name.isEmpty())
            return false;

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            if((ch < 'A' || ch > 'Z') && ch != ' ')
                return false;
        }

        return true;
    }

    static int sumOfDigits(int  n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    static int reduceToSingleDigit(int n)
    {
        while (n > 9)
        {
            n = sumOfDigits(n);
        }

        return n;
    }

    static int luckyNumber(int day, int month, int year)
    {
        if (day > 9)
            day = reduceToSingleDigit(day);

        if (month > 9)
            month = reduceToSingleDigit(month);

        year = reduceToSingleDigit(year);

        int luckyNumber = day + month + year;

        if (luckyNumber > 9)
            luckyNumber = reduceToSingleDigit(luckyNumber);

        return luckyNumber;
    }

    static String personality(int luckyNumber)
    {
        String[] personalities = 
        {
            "The Leader. You naturally take charge, even when nobody asked.",
            "The Peacemaker. You say 'anything is fine' and then judge the biryani.",
            "The Creative. You have ten ideas before breakfast and finish two.",
            "The Planner. You have a timetable. It is not being followed.",
            "The Adventurer. Your definition of a plan is 'we'll figure it out.'",
            "The Perfectionist. You spend 20 minutes deciding where to start.",
            "The Thinker. You analyse everything, including why you analysed it.",
            "The Hustler. Three startup ideas, zero lines of code.",
            "The Legend. Somehow you always find a way to make things interesting."
        };

        return personalities[luckyNumber - 1];
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        name = name.toUpperCase();

        while(!validName(name))
        {
            System.out.println("Invalid Name !!!");
            System.out.print("Please enter letters and space only : ");
            name = sc.nextLine();
            name = name.toUpperCase();
        }

        System.out.print("Enter your birth date : ");
        int day;

        while (!sc.hasNextInt() || (day = sc.nextInt()) < 1 || day > 31)
        {
            System.out.println("Invalid Date !!!");
            System.out.print("Please enter a number between 1-31 : ");
            if (!sc.hasNextInt())
                sc.next();
        }

        System.out.print("Enter your birth month : ");
        int month;

        while (!sc.hasNextInt() || (month = sc.nextInt()) < 1 || month > 12)
        {
            System.out.println("Invalid Month !!!");
            System.out.print("Please enter a number between 1 - 12 : ");
            if (!sc.hasNextInt())
                sc.next();
        }

        System.out.print("Enter your birth year : ");
        int year;

        while (!sc.hasNextInt() || (year = sc.nextInt()) < 1900 || year > 2026)
        {
            System.out.println("Invalid Year !!!");
            System.out.print("Please enter a number between 1900 - 2026 : ");
            if (!sc.hasNextInt())
                sc.next();
        }

        int luckyNumber = luckyNumber(day, month, year);
        String personality = personality(luckyNumber);

        System.out.println("   ============================");
        System.out.println("Name : " + name);
        System.out.println("Date of Birth : " + day + "/" + month + "/" + year);
        System.out.println("Lucky Number : " + luckyNumber);
        System.out.println(personality);
    }
}
