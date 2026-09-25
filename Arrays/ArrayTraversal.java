public class ArrayTraversal 
{
    static void printLeftToRight(int[] nums)
    {
        System.out.println();

        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]);

            if (i < nums.length - 1)
            {
                System.out.print(" -> ");
            }
        }
    }

    static void printRightToLeft(int[] nums)
    {
        System.out.println();

        for (int i = nums.length - 1; i >= 0; i--)
        {
            System.out.print(nums[i]);

            if (i > 0)
            {
                System.out.print(" -> ");
            }
        }
    }

    static void printFromLeftAndRightTowardsCenter(int[] numbers)
    {
        System.out.println();

        int left = 0;
        int right = numbers.length - 1;

        while (left < right)
        {
            System.out.print(numbers[left] + " -> " + numbers[right]);
            left++; 
            right--;

            if (left <= right)
                System.out.print(" -> ");
        }

        if (left == right)
        {
            System.out.print(numbers[left]);
        }
    }

    static void printFromCenterTowardsLeftAndRight(int[] numbers)
    {
        System.out.println();
        int left;
        int right;

        if (numbers.length % 2 == 1)
        {
            System.out.print(numbers[numbers.length/2] + " -> ");
            left = numbers.length / 2 - 1;
            right = numbers.length / 2 + 1;
        }
        else
        {
            left = numbers.length / 2 - 1;
            right = numbers.length / 2;
        }

        while (left >= 0)
        {
            System.out.print(numbers[left] + " -> " + numbers[right]);
            left--;
            right++;

            if (left >= 0)
                System.out.print(" -> ");
        }
    }

    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printLeftToRight(numbers);
        printRightToLeft(numbers);
        printFromLeftAndRightTowardsCenter(numbers);
        printFromCenterTowardsLeftAndRight(numbers);   
    }
}
