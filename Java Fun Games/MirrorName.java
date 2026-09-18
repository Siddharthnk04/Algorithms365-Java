import java.util.Scanner;

public class MirrorName 
{
    static boolean isValidName(String name)
    {
        if(name.isEmpty())
            return false;

        name = name.toUpperCase();

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            if(ch < 'A' || ch > 'Z')
                return false;
        }

        return true;
    }

    static String getreversedName(String name)
    {
        String reversedName = "";
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++)
        {
            reversedName = name.charAt(i) + reversedName;
        }

        return reversedName;
    } 

    static String capitalizeFirstLetter(String name)
    {
        String result = "";
        result += name.charAt(0);
        result = result.toUpperCase();

        for (int i = 1; i < name.length(); i++)
        {
            result = result + name.charAt(i);
        }

        return result;
    }

    static boolean isPalindrome(String name, String nameReversed)
    {
        if (name.equalsIgnoreCase(nameReversed))
            return true;

        return false;
    }

    static String takeEverySecondLetter(String name)
    {
        String spyName = "";

        for (int i = 0; i < name.length(); i+=2)
        {
            spyName = spyName + name.charAt(i);
        }

        return spyName.toUpperCase();
    }

    static int getLetterCount(String name)
    {
        return name.length();
    }

    static double getTypingTime(int letters)
    {
        return letters * 0.3;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        while(!isValidName(name))
        {
            System.out.println("Please enter letters only - one word, no spaces, digits or symbols.");
            System.out.print("Enter your name : ");
            name = sc.nextLine();
        }

        String nameReversed = getreversedName(name);
        
        System.out.println("Your name in the mirror : " + nameReversed);

        if (isPalindrome(name, nameReversed))
        {
            System.out.println("PALINDROME ALERT!!! Your name reads the same both ways.");
        }
        else
        {
            nameReversed = capitalizeFirstLetter(nameReversed);
            System.out.println("Not a palindrome. Your evil twin from the mirror universe is called : " + nameReversed);
        }

        String spyCodeName = takeEverySecondLetter(name);
        int letterCount = getLetterCount(name);
        double typingTime = getTypingTime(letterCount);

        System.out.println("Your secret spy code name : " + spyCodeName);
        System.out.println("Your name has " + letterCount + " letters. Typing it took " + typingTime + " seconds of your life.");
    }
}
