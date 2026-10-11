public class CountPalindrome 
{
    static int countPalindromeNumbers(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return  -1;

        int count = 0;

        for (int x : nums)
        {
            if (isPalindrome(x))
                count++;
        }

        return  count;
    }

    static boolean isPalindrome(int n)
    {
        int temp = n;
        long res = 0;

        while (n > 0)
        {
            res = res * 10 + (n % 10);
            n /= 10;
        }

        if (res == temp)
            return true;

        return false;
    }

    public static void main(String[] args) 
    {
        int nums[] = {121, 45, 7, 1331, 80, 0};

        System.out.println(countPalindromeNumbers(nums));
    }
}
