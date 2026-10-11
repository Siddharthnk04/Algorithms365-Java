import java.util.Arrays;

public class ReplaceNumberWithSum 
{
    static int[] replaceNumberWithSumOfItsDigits(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return nums;

        for (int i = 0; i < nums.length; i++)
            nums[i] = getSumOfDigits(nums[i]);

        return nums;
    }

    static int getSumOfDigits(long n)
    {
        int sum = 0;

        if (n < 0)
            n *= -1;

        while (n != 0)
        {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        int[] nums = {123, -45, 9, Integer.MIN_VALUE};

        System.out.println(Arrays.toString(replaceNumberWithSumOfItsDigits(nums)));
    }
}
