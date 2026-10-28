import java.util.Arrays;

public class Quick 
{
    static void quickSort(int[] nums, int low, int high)
    {
        if (nums == null || nums.length == 0)
            return;

        if (low >= high)
            return;

        int pivot = nums[low];
        int i = low + 1;
        int j = high;

        while (i <= j)
        {
            if(nums[i] > pivot && nums[j] < pivot)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            while (i <= j && nums[i] <= pivot)
                i++;

            while (i <= j && nums[j] > pivot)
                j--;        
        }

        nums[low] = nums[j];
        nums[j] = pivot;
        quickSort(nums, low, j - 1);
        quickSort(nums, i, high);
    }

    public static void main(String[] args) 
    {
        int[] nums = {50, 20, 40, 10, 30, 70, 60, 80};
        int[] nums1 = {8, 3, 1, 5, 4, 2};
        int[] nums2 = {50, 15, 80, 25, 60, 10, 90, 40, 70, 30};
        int[] nums3 = {7, 2, 5, 4, 3, 8, -1};

        quickSort(nums, 0, nums.length - 1);
        quickSort(nums1, 0, nums1.length - 1);
        quickSort(nums2, 0, nums2.length - 1);
        quickSort(nums3, 0, nums3.length - 1);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }
}


