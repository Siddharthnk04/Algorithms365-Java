import java.util.Scanner;

public class ZodiacRoastMachine 
{
    static boolean isValidMonth(String month)
    {
        if (month.isEmpty() || month.length() > 2)
        {
            System.out.println("Please Enter a value between 1 to 12. ");
            return false;
        }

        for (int i = 0; i < month.length(); i++)
        {
            if (month.charAt(i) < '0' || month.charAt(i) > '9')
            {
                System.out.println("Please Enter a value between 1 to 12. ");
                return false;
            }
        }

        if (Integer.valueOf(month) < 1 || Integer.valueOf(month) > 12)
        {
            System.out.println("Please Enter a value between 1 to 12. ");
                return false;
        }

        return true;
    }

    static boolean isValidDay(String day, int month)
    {
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};

        if (day.isEmpty() || day.length() > 2)
        {
            System.out.println("Please Enter a value between 1 to " + months[month - 1]);
            return false;
        }

        for (int i = 0; i < day.length(); i++)
        {
            if (day.charAt(i) < '0' || day.charAt(i) > '9')
            {
                System.out.println("Please Enter a value between 1 to " + months[month - 1]);
                return false;
            }
        }

        if (Integer.valueOf(day) < 1 || Integer.valueOf(day) > months[month - 1])
        {
            System.out.println("Please Enter a value between 1 to " + months[month - 1]);
                return false;
        }

        return true;
    }

    static int getMonthInput(Scanner sc)
    {
        String month = "";
        do
        {
            System.out.print("Enter birth month : ");
            month = sc.nextLine();

        } while(!isValidMonth(month));

        return Integer.valueOf(month);
    }

    static int getDayInput(Scanner sc, int month)
    {
        String day = "";

        do
        {
            System.out.print("Enter your birth day : ");
            day = sc.nextLine();
        } while(!isValidDay(day, month));

        return Integer.valueOf(day);
    }

    static int findSignIndex(int day, int month)
    {
        int[] lastDayOfSignInMonth = {19, 18, 20, 19, 20, 20, 22, 22, 22, 22, 21, 21};
        int index = month - 1;
        if (day > lastDayOfSignInMonth[index])
            index = ++index % 12;

        return index;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Inputs
        int month = getMonthInput(sc);
        int day = getDayInput(sc, month);

        //Zodiac Signs
        String[] zodiacSignNames = {"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini",
                            "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"};

        //Roasts
        String[] roasts ={"Works hard, sleeps harder. Has a 5-year plan and a 5-minute attention span.",
                        "Thinks being different is a personality trait. Probably forgot where they parked.",
                        "Feels everything deeply, including the WiFi signal.",
                        "Turns every small problem into a full-blown adventure.",
                        "Treats food like a love language and naps like a career.",
                        "Has three conversations going at once and finishes none of them.",
                        "Mood changes faster than the weather. Nobody knows which version is arriving.",
                        "Enters the room like it is a stage. The room was a lift.",
                        "Overthinks everything, including whether they should have overthought it.",
                        "Cannot make a decision without first making a pros-and-cons list.",
                        "Trust issues so strong, even the calculator needs verification.",
                        "Says 'five minutes' and disappears for the next three business days."
                    };
        
        //Lucky Snack
        String[] luckySnacks = {"Samosa", "Momos", "Masala Dosa", "Pani Puri", "Vada Pav", "Biryani",
                         "Chole Bhature", "Pav Bhaji", "Gulab Jamun", "Ice Cream", "Pakoda", "Pizza"};

        int zodiacSignIndex = findSignIndex(day, month);
        String zodiacSign = zodiacSignNames[zodiacSignIndex];

        System.out.println("Your Zodiac Sign : " + zodiacSign);
        System.out.println("Roast : " + roasts[zodiacSignIndex]);
        System.out.println("Lucky Snack : " + luckySnacks[zodiacSignIndex]);
    }
}
