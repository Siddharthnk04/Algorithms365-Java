import java.util.Arrays;

public class FirstAndLastPosition 
{
    static int[] searchRange(int[] nums, int target)
    {
        int[] result = {-1, -1};

        if (nums == null || nums.length == 0)
            return result;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
            {
                result[0] = i;

                while (i < nums.length && nums[i] == target)
                    i++;

                result[1] = i - 1;
                break;
            }    
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums = {5, 7, 7, 8, 8, 10};

        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
}
