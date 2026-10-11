import java.util.Arrays;

public class NewArrayWithBiggerNumbers 
{
    static int[] newArrayWithBiggerNumbers(int[] nums1, int[] nums2)
    {
        // Question says Given two arrays of the same length
        if (nums1 == null || nums2 == null || nums1.length == 0)
            return nums1;

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++)
        {
            if (nums1[i] > nums2[i])
                result[i] = nums1[i];
            else
                result[i] = nums2[i];
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums1 = {4, 9, 2, 7};
        int[] nums2 = {6, 3, 8, 7};

        System.out.println(Arrays.toString(newArrayWithBiggerNumbers(nums1, nums2)));
    }
}
