public class ValipPassword 
{
    static void isValidPassword(char[] password)
    {
        if (password == null)
        {
            System.out.println("Invalid Password");
            return;
        }

        if (password.length < 8)
            System.out.println("Password must have altealt 8 achracters");

        boolean isUpperFound = false;
        boolean isLowerFound = false;
        boolean isSpecialCharFound = false;
        boolean isDigitFound = false;

        for (char ch : password)
        {
            if ((ch >= 'A' && ch <= 'Z'))
                isUpperFound = true;
            else if ((ch >= 'a' && ch <= 'z'))
                isLowerFound = true;
            else if ((ch >= '0' && ch <= '9'))
                isDigitFound = true;
            else 
                isSpecialCharFound = true;

        }

        if (!isUpperFound)
            System.out.println("Password must have atleast 1 upper case character.");

        if (!isLowerFound)
            System.out.println("Password must have atleast 1 lower case character.");

        if (!isDigitFound)
            System.out.println("Password must have atleast 1 digit.");

        if (!isSpecialCharFound)
            System.out.println("Password must have atleast 1 special character.");

    }

    public static void main(String[] args) 
    {
        char[] password = {'a','a','a','a','a','a','a'};

        isValidPassword(password);
    }
}
