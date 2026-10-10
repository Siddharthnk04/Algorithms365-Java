public class DifferenceBetweenLargestAndSmallest 
{
    static int findDifferenceBetweenLargestAndSmallest(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        int largest = nums[0];
        int smallest = nums[0];

        for (int x : nums)
        {
            if (x > largest)
                largest = x;

            if (x < smallest)
                smallest = x;
        }

        return largest - smallest;
    }

    public static void main(String[] args) 
    {
        int[] nums = {14, 3, 27, 9};

        System.out.println(findDifferenceBetweenLargestAndSmallest(nums));
    }
}
