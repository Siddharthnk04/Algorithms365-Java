import java.util.Scanner;

public class NameVibeMeter 
{
    static boolean validName(String name)
    {
        name = name.trim();

        if(name.isEmpty())
            return false;

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            if(!isLetter(ch) && ch != ' ')
                return false;
        }

        return true;
    }

    static boolean isLetter(char ch)
    {
        if (ch >= 'A' && ch <= 'Z')
            return true;
        return false;
    }

    static boolean isVowel(char ch)
    {
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }

    static int countVowels(String str)
    {
        int vowels = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (isLetter(ch) && isVowel(ch))
                vowels++;
        }

        return vowels;
    }

    static int countConsonants(String str)
    {
        int consonants = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (isLetter(ch) && !isVowel(ch))
                consonants++;
        }

        return consonants;
    }

    static int calculateLetterPower(String str)
    {
        int letterPower = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (isLetter(ch))
            {
                letterPower += ch - 'A' + 1;
            }
        }

        return letterPower;
    }

    static int calculateVibeScore(int letterPower)
    {
        int vibeScore = letterPower % 101;
        return vibeScore;
    }

    static String getVowelVerdict(int vowels, int consonants)
    {
        if (vowels > consonants)
            return "MUSICAL";
        
        if (vowels == consonants)
            return "BALANCED";
        
        if (consonants >= vowels * 2)
            return "HEAVY METAL";

        return "CLASSIC";
    }

    static String getScoreVerdict(int vibeScore)
    {
        if (vibeScore >= 75)
            return "Main character energy";

        if (vibeScore >= 35)
            return "Reliable side character";
        return "The friend who is always in the group photo, at the edge";
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

        int vowels = countVowels(name);
        int consonants = countConsonants(name);

        int letterPower = calculateLetterPower(name);
        int vibeScore = calculateVibeScore(letterPower);
        String vibe = getVowelVerdict(vowels, consonants);
        String rating = getScoreVerdict(vibeScore);

        System.out.println("   ====================");
        System.out.println("Name : " + name);
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        System.out.println("Letter Power : " + letterPower);
        System.out.println("Vibe Score : " + vibeScore);
        System.out.println("Vibe : " + vibe);
        System.out.println("Rating : " + rating);
    }
}
