import java.util.Arrays;

public class MergeSort 
{
    static int[] mergeSort(int[] nums, int low, int high)
    {
        if (nums == null || nums.length == 0)
            return nums;
        
        if (low == high)
            return new int[] {nums[low]};

        int mid = low + (high - low) / 2;

        int a[] = mergeSort(nums, low, mid);
        int b[] = mergeSort(nums, mid + 1, high);
        return merge(a, b); 
    }

    static int[] merge(int[] a, int[] b)
    {
        int[] result = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length)
        {
            if (a[i] < b[j])
            {
                result[k] = a[i];
                i++;
            }
            else
            {
                result[k] = b[j];
                j++;
            }

            k++;
        }

        while (i < a.length)
        {
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length)
        {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 4, 8, 5, 6, 3, 7, 2, 1};
        int[] nums1 = {10, -4, 8, 0, 6, 3, -7, 21, 1};

        System.out.println(Arrays.toString(mergeSort(nums, 0, nums.length - 1)));
        System.out.println(Arrays.toString(mergeSort(nums1, 0, nums1.length - 1)));
    }
}
