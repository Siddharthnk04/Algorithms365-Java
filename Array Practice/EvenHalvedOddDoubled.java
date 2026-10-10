import java.util.Arrays;

public class EvenHalvedOddDoubled 
{
    static int[] doEvenHalvedOddDoubled (int[] nums)
    {
        if (nums == null || nums.length == 0)
            return nums;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 2 == 0)
                result[i] = nums[i] / 2;
            else
                result[i] = nums[i] * 2;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums = {4, 7, 10, 3};

        System.out.println(Arrays.toString(doEvenHalvedOddDoubled(nums)));
    }
}
