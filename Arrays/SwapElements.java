import java.util.Arrays;

public class SwapElements 
{
    static void swapElements(int[] nums)
    {
        if (nums == null || nums.length <= 1)
            return;

        int left = 0;
        int right = nums.length - 1;

        while (left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 20, 30, 40, 50};
        int[] nums2 = {10, 20, 30, 40, 50, 60};
        int[] nums3 = null;
        int[] nums4 = {};
        int[] nums5 = {5};

        swapElements(nums);
        System.out.println(Arrays.toString(nums));
        swapElements(nums2);
        System.out.println(Arrays.toString(nums2));
        swapElements(nums3);
        System.out.println(Arrays.toString(nums3));
        swapElements(nums4);
        System.out.println(Arrays.toString(nums4)); 
        swapElements(nums5);
        System.out.println(Arrays.toString(nums5));    
    }
}
