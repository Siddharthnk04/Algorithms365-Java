public class PalindromeCharacters 
{
    static boolean isPalindrome(char[] arr)
    {
        if(arr == null || arr.length == 0)
            return false;

        for (int i = 0; i < arr.length / 2; i++)
        {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'m','a','d','d','a','m'};

        System.out.println(isPalindrome(arr));
    }
}
