import java.util.Arrays;

public class AverageOfEachArray 
{
    static double [] findAverageOfEachArray(int[] nums1, int[] nums2, int[] nums3)
    {
        return new double[] {getAverage(nums1), getAverage(nums2), getAverage(nums3)};
    }

    static double getAverage(int[] nums)
    {
        double average = 0.0;

        for (int x : nums)
            average += x;

        return average / nums.length;
    }

    public static void main(String[] args) 
    {
        int[] nums1 = {10, 20, 30};
        int[] nums2 = {5, 15};
        int[] nums3 = {8, 8, 8, 8};

        System.out.println(Arrays.toString(findAverageOfEachArray(nums1, nums2, nums3)));

    }
}
