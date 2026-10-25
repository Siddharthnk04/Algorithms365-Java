import java.util.Arrays;

public class Merge 
{
    static void mergeSort(int[] nums, int low, int high)
    {
        if (nums == null || nums.length == 0)
            return;
        
        //Single element
        if (low == high)
            return;

        //calculate mid
        int mid = low + (high - low) / 2;

        //Sort left
        mergeSort(nums, low, mid);

        //Sort Right
        mergeSort(nums, mid + 1, high);

        //Merge
        merge(nums, low, high, mid); 
    }

    static void merge(int[] nums, int low, int high, int mid)
    {
        int[] result = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high)
        {
            if (nums[i] < nums[j])
            {
                result[k] = nums[i];
                i++;
            }
            else
            {
                result[k] = nums[j];
                j++;
            }

            k++;
        }

        while (i <= mid)
        {
            result[k] = nums[i];
            i++;
            k++;
        }

        while (j <= high)
        {
            result[k] = nums[j];
            j++;
            k++;
        }

        for (i = low, k = 0; i <= high; i++, k++)
            nums[i] = result[k]; 
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 4, 8, 5, 6, 3, 7, 2, 1};
        int[] nums1 = {10, -4, 8, 0, 6, 3, -7, 21, 1};

        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        mergeSort(nums1, 0, nums1.length - 1);
        System.out.println(Arrays.toString(nums1));
    }
}
