public class SelectionSort 
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
        
        for (int x : array)
        {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    static void selectionSort(int[] nums)
    {
        if (nums == null || nums.length <= 1)
            return;

        for (int i = 0; i < nums.length - 1; i++)
        {
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[j] < nums[minIndex])
                    minIndex = j;
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {9, 2, 16, 6, 1, 13, 1};
        printArrayElements(nums);

        selectionSort(nums);
        printArrayElements(nums);

        System.out.println();
        
        int[] nums2 = {-1, 8, -8, 9, 0, 0, -5};
        printArrayElements(nums2);

        selectionSort(nums2);
        printArrayElements(nums2);
    }
}
