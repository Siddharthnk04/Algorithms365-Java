public class StringAndCharArr 
{
    static boolean isVowel(char ch)
    {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
        );
    }

    // Count Special Character
    // Char array
    static void countSpecialCharacters(char[] arr)
    {
        int count = 0;

        for (char ch : arr)
        {
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ')
                continue;

            count++;
        }

        System.out.println(count);
    }

    // String
    static void countSpecialCharacters(String str)
    {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || ch == ' ')
                continue;

            count++;
        }

        System.out.println(count);
    }

    // Search Characters
    // Char array
    static boolean searchCharcter(char[] arr, char key)
    {
        if (arr == null || arr.length == 0)
            return false;

        for (char ch : arr)
        {
            if (ch == key)
                return true;
        }

        return false;
    }

    // String
    static boolean searchCharcter(String str, char key)
    {
        if (str == null || str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == key)
                return true;
        }

        return false;
    }

    // Count occurance
    // Char array
    static void countOccurance(char[] arr, char key)
    {
        int count = 0;

        for (char ch : arr)
        {
            if (ch == key)
                count++;
        }

        System.out.println(count);
    }

    // String
    static void countOccurance(String str, char key)
    {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == key)
                count++;
        }

        System.out.println(count);
    }

    // Largest Character
    // Char Array
    static void findLargestCharacter(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return;

        char largest = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > largest)
                largest = arr[i];

        System.out.println(largest);
    }

    // String 
    static void findLargestCharacter(String str)
    {
        if (str == null || str.length() == 0)
            return;

        char largest = str.charAt(0);

        for (int i = 1; i < str.length(); i++)
            if (str.charAt(i) > largest)
                largest = str.charAt(i);
        
        System.out.println(largest);
    }

    // Replace Vowels with *
    // Char array
    static void replaceVowelsWithStar(char[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (isVowel(arr[i]))
                arr[i] = '*';
        }

        System.out.println(arr);
    }

    // String
    static void replaceVowelsWithStar(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (isVowel(str.charAt(i)))
                result += '*';
            else
                result += str.charAt(i);
        }

        System.out.println(result);
    }

    // Reverse Charcter array
    // Char array
    static void reverseCharArray(char[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(arr);
    }

    // Reverse String
    static void reverseString(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); i++)
            result = str.charAt(i) + result;

        System.out.println(result);
    }

    // Check Pl=alindrome
    // Char array
    static boolean isPalindrome(char[] arr)
    {
        if (arr == null)
            return false;

        for (int i = 0; i < arr.length / 2; i++)
            if (arr[i] != arr[arr.length - 1 - i])
                return false;

        return true;
    }

    // String
    static boolean isPalindrome(String str)
    {
        if (str == null)
            return false;

        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;

        return true;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'a', ' ', 's', 't', 'i', '@', 'z', 'm', '8', '&'};
        char[] arr1 = {'m', 'a', 'd', 'a', 'm'};

        // countSpecialCharacters(arr);
        // countSpecialCharacters("A&h(j%h$# 109@");

        // System.out.println(searchCharcter(arr, '9'));
        // System.out.println(searchCharcter("ar8857r", '7'));

        // countOccurance(arr, 'a');
        // countOccurance("asuhrt87jkjherrrr", 'r');

        // findLargestCharacter(arr);
        // findLargestCharacter("afwtyegdyw");

        // replaceVowelsWithStar(arr);
        // replaceVowelsWithStar("apiwegchj");

        // reverseCharArray(arr);
        // reverseString("djhedh");

        System.out.println(isPalindrome(arr1));
        System.out.println(isPalindrome("maddam"));

    }
}
