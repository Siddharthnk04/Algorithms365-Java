import java.util.Arrays;
import java.util.HashSet;

public class ElementsThatAreNotPresentInSecondArray 
{
    static int[] findElementsThatAreNotPresentInSecondArray(int[] nums1, int[] nums2)
    {
        if (nums1 == null || nums2 == null)
            return null;

        if (nums1.length == 0 || nums2.length == 0)
            return nums1;

        HashSet <Integer> set = new HashSet<>();

        for (int x : nums2)
            set.add(x);

        int count = 0;

        for (int x : nums1)
        {
            if (!set.contains(x))
                count++;
        }

        int[] result = new int[count];
        int index = 0;

        for (int x : nums1)
        {
            if (!set.contains(x))
            {
                result[index] = x;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums1 = {1, 4, 6, 8, 10};
        int[] nums2 = {4, 8, 12};

        System.out.println(Arrays.toString(findElementsThatAreNotPresentInSecondArray(nums1, nums2)));
    }
}
