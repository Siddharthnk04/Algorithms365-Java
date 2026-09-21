import java.util.Scanner;

public class FlamesCalculator 
{
    static boolean isValidName(String name)
    {
        if(name.isEmpty())
        {
            System.out.println("Enter only letters and space.");
            return false;
        }

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);

            if(!isLetter(ch) && ch != ' ')
            {
                System.out.println("Enter only letters and space.");
                return false;
            }
        }

        return true;
    }

    static boolean isLetter(char ch)
    {
        if (ch >= 'a' && ch <= 'z')
            return true;
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        String firstName;
        String secondName;

        do
        {
            System.out.print("Your name : ");
            firstName = sc.nextLine();
            firstName = firstName.toLowerCase();
        } while(!isValidName(firstName));

        do
        {
            System.out.print("Their name : ");
            secondName = sc.nextLine();
            secondName = secondName.toLowerCase();
        } while(!isValidName(secondName));


    }
}
