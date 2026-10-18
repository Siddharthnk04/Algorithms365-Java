public class BinaryArrayToDecimal 
{
    static long getDecimalValue(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        long decimalValue = 0;

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = nums[i] & 1;
            decimalValue = decimalValue * 2 + nums[i];
        }    

        return decimalValue;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2, 0, 3, 17, 87, 23, 6};

        System.out.println(getDecimalValue(nums));
    }
}
