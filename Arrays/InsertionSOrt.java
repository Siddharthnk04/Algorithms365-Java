public class InsertionSOrt 
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

    static void insertionSort(int[] nums)
    {
        if (nums == null || nums.length <= 1)
            return;
        
        for (int i = 1; i < nums.length; i++)
        {
            int key = nums[i];
            int j = i;

            while (j > 0 && nums[j - 1] > key)
            {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = key;
        }
    }

    public static void main(String[] args) 
    {
        int[] nums = {9, 8, 7, 6, 6, -5, -4, 1};

        printArrayElements(nums);
        insertionSort(nums);
        printArrayElements(nums);
    }
}
