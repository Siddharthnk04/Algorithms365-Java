public class KConsecutiveElementsSum 
{
    static int largestKConsecutiveSum(int[] nums, int k)
    {
        if (nums == null || nums.length == 0 || k > nums.length)
            return -1;

        int sum = 0;

        for (int i = 0; i < k; i++)
        {
            sum += nums[i];
        }

        int result = sum;

        for (int i = k; i < nums.length; i++)
        {
            sum = sum - nums[i - k] + nums[i];
            
            if (sum > result)
                result = sum;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2, 1, 5, 1, 3, 2};
        System.out.println(largestKConsecutiveSum(nums, 3));
    }
}
