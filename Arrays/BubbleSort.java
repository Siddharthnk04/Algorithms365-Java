
public class BubbleSort 
{
    static void printArrayElements(int[] array)
    {
        if (array == null)
        {
            System.out.println("null");
            return;
        }

        if (array.length == 0)
        {
            System.out.println("[]");
            return;
        }
        
        System.out.print("[ ");
        for (int x : array)
        {
            System.out.print(x + " ");
        }
        System.out.print("]");

        System.out.println();
    }

    static void bubbleSort(int[] nums)
    {
        if (nums == null || nums.length <= 1)
            return;

        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = 0; j < nums.length - i - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {5, 4, 3, 2, 1};
        int[] nums1 = null;
        int[] nums2 = {};
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {5};
        int[] nums5 = {1, 6, 1, 8, 2, 3, 6};
        int[] nums6 = {2, -5, -6, -5, 8, 0, 0, -3, 9};

        bubbleSort(nums);
        printArrayElements(nums);
        bubbleSort(nums1);
        printArrayElements(nums1);
        bubbleSort(nums2);
        printArrayElements(nums2);
        bubbleSort(nums3);
        printArrayElements(nums3);
        bubbleSort(nums4);
        printArrayElements(nums4);
        bubbleSort(nums5);
        printArrayElements(nums5);
        bubbleSort(nums6);
        printArrayElements(nums6);
    }
}
