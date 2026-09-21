import java.util.Scanner;

public class WhichDayWereYouBorn 
{
    static int getYearInput(Scanner sc)
    {
        String year;
        do
        {
            System.out.print("Enter your birth year (1900 - 2026) : ");
            year = sc.nextLine();
        } while (!isValidYear(year));

        return Integer.valueOf(year);
    }

    static boolean isValidYear(String year)
    {
        if (year.isEmpty() || year.length() > 4)
        {
            System.out.println("Please Enter value between 1900 and 2026.");
            return false;
        }

        for (int i = 0; i < year.length(); i++)
        {
            if (year.charAt(i) < '0' || year.charAt(i) > '9')
            {
                System.out.println("Please Enter value between 1900 and 2026.");
                return false;
            }
        }

        if (Integer.valueOf(year) < 1900 || Integer.valueOf(year) > 2026)
        {
            System.out.println("Please Enter value between 1900 and 2026.");
            return false;
        }

        return true;
    }

    static int getMonthInput(Scanner sc)
    {
        String month;

        do
        {
            System.out.print("Enter your birth month (1 - 12) : ");
            month = sc.nextLine();
        } while (!isValidMonth(month));

        return Integer.valueOf(month);
    }

    static boolean isValidMonth(String month)
    {
        if (month.isEmpty() || month.length() > 2)
        {
            System.out.println("Please Enter value between 1 and 12.");
            return false;
        }

        for (int i = 0; i < month.length(); i++)
        {
            if (month.charAt(i) < '0' || month.charAt(i) > '9')
            {
                System.out.println("Please Enter value between 1 and 12.");
                return false;
            }
        }

        if (Integer.valueOf(month) < 1 || Integer.valueOf(month) > 12)
        {
            System.out.println("Please Enter value between 1 and 12.");
            return false;
        }

        return true;
    }

    static int getDayInput(Scanner sc, int month, int year)
    {
        String day;
        int maxDay = getDaysInMonth(month);
        if (month == 2 && isLeapYear(year))
            maxDay = maxDay + 1;
        
        do
        {
            System.out.print("Enter your birth date (1 - " + maxDay + ") : ");
            day = sc.nextLine();
        } while (!isValidDay(day, maxDay));

        return Integer.valueOf(day);
    }

    static boolean isValidDay(String day, int maxDay)
    {
        if (day.isEmpty() || day.length() > 2)
        {
            System.out.println("Please Enter value between 1 and " + maxDay + ".");
            return false;
        }

        for (int i = 0; i < day.length(); i++)
        {
            if (day.charAt(i) < '0' || day.charAt(i) > '9')
            {
                System.out.println("Please Enter value between 1 and " + maxDay + ".");
                return false;
            }
        }

        if (Integer.valueOf(day) < 1 || Integer.valueOf(day) > maxDay)
        {
            System.out.println("Please Enter value between 1 and " + maxDay + ".");
            return false;
        }

        return true;
    }

    static int getDaysInMonth(int month)
    {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        return daysInMonth[month - 1];
    }

    static boolean isLeapYear(int year)
    {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }

    static int calculateWeekday(int day, int month, int year)
    {
        if (month < 3)
        {
            month += 12;
            year -= 1;
        }

        int k = year % 100;
        int j = year / 100;

        return  (day + 13*(month+1)/5 + k + k/4 + j/4 + 5*j) % 7;
    }

    static String getWeekDayJoke(int weekDayIndex)
    {
        String[] weekDayJokes = {"Saturday baby: No alarm. No regrets.",
                                "Sunday baby: Enjoy it. Tomorrow is Monday.",
                                "Monday baby: You survived the weekend. Barely.",
                                "Tuesday baby: Monday's sequel nobody asked for.",
                                "Wednesday baby: Halfway there. Keep going.",
                                "Thursday baby: Friday is close enough to feel real.",
                                "Friday baby: Your weekend loading bar is almost full."
                                };

        return weekDayJokes[weekDayIndex];
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int year = getYearInput(sc);
        int month = getMonthInput(sc);
        int day = getDayInput(sc, month, year);

        String[] WEEKDAY_NAMES = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday",
                                 "Thursday", "Friday"};

        int weekDayIndex = calculateWeekday(day, month, year);
        String weekDay = WEEKDAY_NAMES[weekDayIndex]; 
        String weekDayJoke = getWeekDayJoke(weekDayIndex);
        String currentBirthday = WEEKDAY_NAMES[calculateWeekday(day, month, 2026)];

        System.out.println("You were born on a " + weekDay + "!");
        System.out.println(weekDayJoke);
        System.out.println("This year your birthday falls on " + currentBirthday);
    }
}
