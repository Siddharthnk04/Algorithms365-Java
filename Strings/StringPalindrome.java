public class StringPalindrome 
{
    static boolean isValidPalindrome(String s)
    {
        String temp = "";
        
        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') || (x >= '0' && x <= '9'))
            {
                temp += x;
            }
        }

        temp = temp.toLowerCase();

        int left = 0;
        int right = temp.length() - 1;

        while (left < right)
        {
            if (temp.charAt(left) != temp.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
    }
}
