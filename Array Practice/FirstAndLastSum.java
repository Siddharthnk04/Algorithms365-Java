public class FirstAndLastSum 
{
    static int findFirstAndLastElementSum(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        return nums[0] + nums[nums.length - 1];
    }

    public static void main(String[] args) 
    {
        int[] nums = {7, 3, 9, 4};

        System.out.println(findFirstAndLastElementSum(nums));
    }
}
