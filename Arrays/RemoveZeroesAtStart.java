import java.util.*;
public class RemoveZeroesAtStart 
{
    static void removeZeroesAtStart(int[] nums)
    {
        int firstNonZero = 0;
        int index = 0;

        while (firstNonZero < nums.length)
        {
            if (nums[firstNonZero] != 0)
                break;

            firstNonZero++;
            index++;
        }

        int writeIndex = 0;
        for (; index < nums.length; index++)
        {
            int temp = nums[writeIndex];
            nums[writeIndex] = nums[index];
            nums[index] = temp;
            writeIndex++;
        }
    }

    static void removeZeroesAtFront(int[] nums)
    {
        if (nums == null || nums.length == 0 || nums[0] != 0)
            return;

        int index = 0;

        while (index < nums.length && nums[index] == 0)
            index++;

        for (int write = 0; index < nums.length; write++)
        {
            nums[write] = nums[index];
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {0, 1, 0, 0};

        removeZeroesAtFront(nums);
        System.out.println(Arrays.toString(nums));
    }
}
