public class MinSubArrayLength 
{
    static int minSubArrayLen(int[] nums, int target)
    {
        int left = 0;
        int right = 0;
        int sum = 0;
        int length = 0;
        int minLength = Integer.MAX_VALUE;

        while (right < nums.length)
        {
            sum += nums[right];
            right++;
            length++;

            while (sum >= target)
            {
                if (length < minLength)
                    minLength = length;

                sum -= nums[left];
                left++;
                length--;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            return 0;

        return minLength;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(nums, 7));
        
    }
}
