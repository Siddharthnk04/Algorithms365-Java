import java.util.Arrays;

public class ReverseArray 
{
    static void reverseArray(int[] nums)
    {
        Stack stack = new Stack(nums.length);

        for (int i = 0; i < nums.length; i++)
            stack.push(nums[i]);

        for (int i = 0; i < nums.length; i++)
            nums[i] = stack.pop();
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 51, 20, 8, -9, 12};
        
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
