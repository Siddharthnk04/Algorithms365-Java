public class PasswordCheck 
{
    static boolean checkPassword(char[] password)
    {
        if (password == null)
            return false;

        if (password.length < 8)
            return false;

        for (char ch : password)
        {
            if (ch >= '0' && ch <= '9')
                return true;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        char[] password = {'s','e','c','r','e','t','9'};

        System.out.println(checkPassword(password));
    }
}
