import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement 
{
    static int[] getNextGreaterElement(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return nums;
        
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++)
        {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()])
                result[stack.pop()] = nums[i];

            stack.push(i);
        }

        while (!stack.isEmpty())
        {
            result[stack.pop()] = -1;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums = {4, 5, 2, 25};

        System.out.println(Arrays.toString(getNextGreaterElement(nums)));
    }
}
