import java.util.Arrays;

public class BackwardTraversal 
{
    static int countEvenNumbersFromBack(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        int count = 0;

        for (int i = nums.length - 1; i > -1; i--)
        {
            if ((nums[i] & 1) == 0)
                count++;
        }

        return count;
    }

    static int findFirstNegativeNumberFromRight(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return 0;

        for (int i = nums.length - 1; i > -1; i--)
        {
            if (nums[i] < 0)
                return nums[i];
        }

        return 0;
    }

    static int findLastPositiveNumber(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        for (int i = nums.length - 1; i > -1; i--)
        {
            if (nums[i] > 0)
                return nums[i];
        }

        return -1;
    } 

    static int findLastOccurance(int[] nums, int k)
    {
        if (nums == null || nums.length == 0)
            return -1;

        for (int i = nums.length - 1; i > -1; i--)
        {
            if (nums[i] == k)
                return i;
        }

        return -1;
    }

    static void printElemetsGreaterThanGivenValue1(int[] nums, int k)
    {
        if (nums == null || nums.length == 0)
            return;

        for (int i = nums.length - 1; i > -1; i--)
        {
            if (nums[i] > k)
                System.out.print(nums[i] + " ");
        }
    }

    static int[] copyReverse(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return nums;

        int[] result = new int[nums.length];

        for (int i = nums.length - 1; i > -1; i--)
            result[nums.length - 1 - i] = nums[i];

        return result;
    }

    static void replaceEveryEvementWithGreatestOnItsRight(int[] nums)
    {
        if (nums == null || nums.length < 2)
        {
            System.out.println(Arrays.toString(nums));
            return;
        }    

        int greatest = nums[nums.length - 1];

        for (int i = nums.length - 2; i > -1; i--)
        {
            int curr = nums[i];
            nums[i] = greatest; 
            greatest = Math.max(greatest, curr);
        }

        System.out.println(Arrays.toString(nums));
    }

    static void reverseArrayInplace(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return;   

        for (int i = nums.length - 1; i >= nums.length / 2; i--)
        {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }

    static void moveZerosToFront(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return;  

        int j = nums.length - 1;

        for (int i = nums.length - 1; i > -1; i--)
        {
            if (nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) 
    {
        // Count even numbers while traversing from right
        // System.out.println(countEvenNumbersFromBack(new int[] {5, 6, 9, 10, 58}));
        
        // Find first -ve number from right
        // System.out.println(findFirstNegativeNumberFromRight(new int[] {5, 5, 9, -1, 6, -2, 9}));

        // Find last +ve number
        // System.out.println(findLastPositiveNumber(new int[] {5, -8, 9, 40, -8, -9}));

        // Find last occurance of a given element
        // System.out.println(findLastOccurance(new int[] {8, 5, 6, 8, 9, 2, 8}, 8));
  
        // Print elements greater than given value
        // printElemetsGreaterThanGivenValue1(new int[] {8, 9, 10, -8, 5, 2, 30}, 5);
  
        // Reverse copy and store it in nother array
        // System.out.println(Arrays.toString(copyReverse(new int[] {8, 5, -4, 9, 21})));

        // Replace every element with greatest element on its right
        // replaceEveryEvementWithGreatestOnItsRight(new int[] {4, 5, 6, 1, 10, 8, 9,5 , -8, 4, 2});

        // Reverse an array in place
        // reverseArrayInplace(new int[] {5, 8, 6, 9, 2, 0, -9});

        // Moves zeros to front
        moveZerosToFront(new int[] {0, 0, 8, 9, 6, 0, 0, 4, 5, 3, 0});

    }
}
