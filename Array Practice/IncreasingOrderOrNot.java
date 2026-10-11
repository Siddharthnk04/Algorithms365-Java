public class IncreasingOrderOrNot 
{
    static boolean isSorted(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return false;

        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i + 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        int nums[] = {2, 5, 9, 14};
        int nums2[] = {2, 5, 7, 13, 11};

        System.out.println(isSorted(nums));
        System.out.println(isSorted(nums2));
    }
}
