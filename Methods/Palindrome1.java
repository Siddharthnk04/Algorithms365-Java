public class Palindrome1 
{
    //Static void
    static void palindrome (int num)
    {
        int temp = num, rev = 0;

        while (num > 0)
        {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) 
    {
        int a = 1201;

        palindrome(a);
    }


    //Static non void
    /*static boolean palindrome (int num)
    {
        int temp = num, rev = 0;

        while (num > 0)
        {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (temp == rev)
            return true;
        return false;
    }

    public static void main(String[] args) 
    {
        int a = 1201;

        if (palindrome(a))
            System.out.println("Palindrome.");
        else
            System.out.println("Not a palindrome.");
    }*/


    //Instance void
    /*void palindrome (int num)
    {
        int temp = num, rev = 0;

        while (num > 0)
        {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) 
    {
        int a = 121;

        Palindrome1 obj = new Palindrome1();

        obj.palindrome(a);
        
    }*/


    //Instance non void
    /*boolean palindrome (int num)
    {
        int temp = num, rev = 0;

        while (num > 0)
        {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (temp == rev)
            return true;
        return false;
    }

    public static void main(String[] args) 
    {
        int a = 121;

        Palindrome1 obj = new Palindrome1();

        if (obj.palindrome(a))
            System.out.println("Palindrome.");
        else
            System.out.println("Not a palindrome.");
    }*/
}
