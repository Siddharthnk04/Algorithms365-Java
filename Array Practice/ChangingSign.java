public class ChangingSign 
{
    static int countChangingSign(int[] nums)
    {
        if (nums ==  null ||nums.length == 0)
            return -1;

        int count = 0;

        for (int i = 0; i < nums.length - 1; i++)
        {
            // if (nums[i] >= 0 && nums[i + 1] < 0)
            //     count++;
            // else if (nums[i] < 0 && nums[i + 1] >= 0)
            //     count++;

            if ((nums[i] >= 0) != (nums[i + 1] >= 0))
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        int nums[] = {3, -2, -5, 4, 6, -1};

        System.out.println(countChangingSign(nums));
    }
}
