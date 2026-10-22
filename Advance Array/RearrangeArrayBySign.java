
import java.util.Arrays;


public class RearrangeArrayBySign 
{
    static void rearrangeArrayBySign(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return;

        int positive = 0;
        int negative = 1;

        while (positive < nums.length)
        {
            if (nums[positive] < 0)
            {
                int search = positive + 1;

                while (search < nums.length && nums[search] < 0)
                    search++;

                int temp = nums[search];

                while (search > positive)
                {
                    nums[search] = nums[search - 1];
                    search--;
                }

                nums[positive] = temp;
            }

            if (nums[negative] > 0)
            {
                int search = negative + 1;

                while (search < nums.length && nums[search] > 0)
                    search++;

                int temp = nums[search];

                while (search > negative)
                {
                    nums[search] = nums[search - 1];
                    search--;
                }

                nums[negative] = temp;
            }

            positive += 2;
            negative += 2;
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {3, 1, -2, -5, 2, -4};
        rearrangeArrayBySign(nums);
        System.out.println(Arrays.toString(nums));
    }
}
