import java.util.Arrays;

public class ReplaceNegativeByZero 
{
    static int[] replaceNegativeByZero(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return nums;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] < 0)
                nums[i] = 0;
        }

        return nums;
    }

    public static void main(String[] args) 
    {
        int[] nums = {5, -3, 8, -1, 0};
        
        System.out.println(Arrays.toString(replaceNegativeByZero(nums)));
    }
}
