import java.util.Scanner;

public class HowLongHaveYouBeenLoading 
{
    static int getYearInput(Scanner sc, String dateType)
    {
        String year;
        do
        {
            System.out.print("Enter your " + dateType + " year (1900 - 2100) : ");
            year = sc.nextLine();
        } while (!isValidYear(year));

        return Integer.valueOf(year);
    }

    static boolean isValidYear(String year)
    {
        if (year.isEmpty() || year.length() > 4)
        {
            System.out.println("Please Enter value between 1900 and 2100.");
            return false;
        }

        for (int i = 0; i < year.length(); i++)
        {
            if (year.charAt(i) < '0' || year.charAt(i) > '9')
            {
                System.out.println("Please Enter value between 1900 and 2100.");
                return false;
            }
        }

        if (Integer.valueOf(year) < 1900 || Integer.valueOf(year) > 2100)
        {
            System.out.println("Please Enter value between 1900 and 2100.");
            return false;
        }

        return true;
    }

    static int getMonthInput(Scanner sc, String dateType)
    {
        String month;

        do
        {
            System.out.print("Enter your " + dateType + " month (1 - 12) : ");
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

    static int getDayInput(Scanner sc, int month, int year, int[] DAYS_IN_MONTH, String dateType)
    {
        String day;
        int maxDay = getDaysInMonth(month, DAYS_IN_MONTH);
        if (month == 2 && isLeapYear(year))
            maxDay = maxDay + 1;
        
        do
        {
            System.out.print("Enter your " + dateType + " date (1 - " + maxDay + ") : ");
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

    static int getDaysInMonth(int month, int[] daysInMonth)
    {
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

    static int getDaysCountInAYear(int[] date, int[] daysInMonth)
    {
        int daysCount = 0;
        for (int i =0; i < date[1] - 1; i++)
        {
            daysCount += daysInMonth[i];
        }

        daysCount = daysCount + date[0];

        if (isLeapYear(date[2]))
        {
            if (date[1] > 2)
            {
                daysCount += 1;
            }
        }

        return daysCount;
    }

    static int calculateDaysBetween(int startYear, int endYear)
    {
        int daysCount = 0;
        for (int i = startYear; i <= endYear; i++)
        {
            if (isLeapYear(i))
                daysCount += 366;
            else
                daysCount += 365;
        }

        return daysCount;
    }

    static boolean isDateBefore(int birthYear, int birthMonth, int birthDay,
                                int currentYear, int currentMonth, int currentDay)
    {
        if (currentYear < birthYear)
            return true;

        if (currentYear == birthYear)
        {
            if (currentMonth < birthMonth)
                return true;

            if (currentMonth == birthMonth && currentDay < birthDay)
                return true;
        }

        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

         int[] DAYS_IN_MONTH = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("   ===== Your date of birth =====");
        int birthYear = getYearInput(sc, "birth");
        int birthMonth = getMonthInput(sc, "birth");
        int birthDay = getDayInput(sc, birthMonth, birthYear, DAYS_IN_MONTH, "birth");

        System.out.println("   ===== Today's date =====");
        int currentYear = getYearInput(sc, "current");
        int currentMonth = getMonthInput(sc, "current");
        int currentDay = getDayInput(sc, currentMonth, currentYear, DAYS_IN_MONTH, "current");

        int[] birthDate = {birthDay, birthMonth, birthYear};
        int[] currentDate = {currentDay, currentMonth, currentYear};

        if (isDateBefore(birthYear, birthMonth, birthDay, currentYear, currentMonth, currentDay))
        {
            System.out.println("Today's date cannot be before your birth date.");
            return;
        }

        int daysAlive;

        int currentDayCount = getDaysCountInAYear(currentDate, DAYS_IN_MONTH);

        if (birthYear == currentYear)
        {
            int birthDayCount = getDaysCountInAYear(birthDate, DAYS_IN_MONTH);
            daysAlive = currentDayCount - birthDayCount;
        }
        else
        {
            int birthDaysCount = 365 - getDaysCountInAYear(birthDate, DAYS_IN_MONTH);

            if (isLeapYear(birthYear))
                birthDaysCount += 1;

            daysAlive = birthDaysCount + currentDayCount + calculateDaysBetween(birthYear + 1, currentYear - 1);
        }

        int hours = daysAlive * 24;
        int weeks = daysAlive / 7;
        long heartbeats = daysAlive * 24 * 60 * 70L;
        int daysSlept = daysAlive / 3;
        int chaiConsumed = 0;
        if (daysAlive > 2000)
        {
            chaiConsumed = (daysAlive - 2000) * 2;
        }
        int nextThousandDaysIn = 1000 - (daysAlive % 1000);

        System.out.println("You have been loading on Earth for " + daysAlive + " days.");
        System.out.println("That is " + hours + " hours, and " + weeks + " weeks.");
        System.out.println("Your heart has beaten about " + heartbeats + " times.");
        System.out.println("You spent about " + daysSlept + " full days sleeping.");
        System.out.println("Approx. chai consumed: " + chaiConsumed + " cups.");
        System.out.println("Next 1000-day milestone in " + nextThousandDaysIn + " days.");

    }
}
