public class ReverseAll 
{
    static String reverse(String str)
    {
        String rev = "";

        for (int i = 0; i < str.length(); i++)
        {
            rev = str.charAt(i) + rev;
        }

        return rev;
    }

    public static void main(String[] args) 
    {
        for (String x : args)
        {
            System.out.println(reverse(x));
        }
    }
}
