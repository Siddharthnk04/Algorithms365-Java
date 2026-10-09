

public class EqualSum 
{
    static int getEqualSumIndex(int[] nums)
    {
        if (nums == null)
            return -1;

        double totalSum = 0.0;

        for (int x : nums)
        {
            totalSum += x;
        }

        int currsum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (currsum == (totalSum - nums[i]) / 2)
                return i;
            currsum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        int[] nums = {1, 7, 3, 6, 5, 6, 1};

        System.out.println(getEqualSumIndex(nums));
    }
}
