public class Palindrome125 
{
    // Helper method
    // Returns true if a given character is not alpphanumeric
    public static boolean isNonAlphanumeric(char x)
    {
        if ((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z') || (x >= '0' && x <= '9'))
            return false;
        return true;
    }

    // Using String
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static boolean isPalindromeUsingString(String s)
    {
        // two pointers
        int left = 0;
        int right = s.length() - 1;

        while (left < right)
        {
            // left is non alphanumeric
            if (isNonAlphanumeric(s.charAt(left)))
            {
                left++;
                continue;
            }

            // right is non alphanumeric 
            if (isNonAlphanumeric(s.charAt(right)))
            {
                right--;
                continue;
            }

            // charcters doesnt match
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
            
        }

        return true;
    }

    // Using StringBuilder
    // Reverse method is present in String Builder Class
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public static boolean isPalindromeUsingStringBuilder(String str)
    {
        str = str.toLowerCase();

        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            // add alphanumneric charcter to the string Builder temp
            if (!isNonAlphanumeric(str.charAt(i)))
            {
                // Here we can do temp += str.charAt(i)... But it will create new object every time
                temp.append(str.charAt(i));
            }
        }

        // check the cleaned string is equals to its reverse
        return temp.equals(temp.reverse());
    }

    // Using String Buffer
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public static boolean isPalindromeUsingStringBuffer(String str)
    {
        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < str.length(); i++)
        {
            // add alphanumneric charcter to the string Buffer temp 
            if (!isNonAlphanumeric(str.charAt(i)))
            {
                temp.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        // check the cleaned string is equals to its reverse
        return temp.equals(temp.reverse());
    }

    // Using Char Array
    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public static boolean isPalindromeUsingCharArray(String str)
    {
        str = str.toLowerCase();

        char[] strArray = str.toCharArray();

        // two pointers
        int left = 0;
        int right = strArray.length - 1;

        while (left < right)
        {
            if (!Character.isLetterOrDigit(strArray[left]))
            {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(strArray[right]))
            {
                right--;
                continue;
            }

            if (strArray[left] != strArray[right])
                return false;

            left++;
            right--;
        }

        return true;
    }


    public static void main(String[] args) 
    {
        System.out.println(isPalindromeUsingString("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeUsingStringBuilder("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeUsingStringBuffer("\"A man, a plan, a canal: Panama\""));
        System.out.println(isPalindromeUsingCharArray("\"A man, a plan, a canal: Panama\""));
    }
}
