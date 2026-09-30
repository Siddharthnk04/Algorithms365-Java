public class ArrayDeletion 
{
    static void printArrayElements(int[] array)
    {
        if (array.length == 0)
        {
            System.out.println("Array is Empty!!!");
            return;
        }

        for (int x : array)
        {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    static int[] deleteAtStart(int[] numbers)
    {
        if (numbers.length == 0)
        {
            System.out.println("Array is Empty!! Cannot delete.");
            return new int[] {};
        }

        int[] result = new int[numbers.length - 1];

        for (int i = 1; i < numbers.length; i++)
        {
            result[i - 1] = numbers[i];
        }

        return result;
    }

    static int[] deleteAtEnd(int[] numbers)
    {
        if (numbers.length == 0)
        {
            System.out.println("Array is Empty!! Cannot delete.");
            return new int[] {};
        }

        int[] result = new int[numbers.length - 1];

        for (int i = 0; i < result.length; i++)
        {
            result[i] = numbers[i];
        }

        return result;
    }

    static int[] deleteValue(int[] numbers, int value)
    {
        if (numbers.length == 0)
        {
            System.out.println("Array is Empty!! Cannot delete.");
            return new int[] {};
        }

        int index = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == value)
            {
                index = i;
                break;
            }
        }

        if (index == -1)
        {
            System.out.println("Value " + value + ", does not exist!!!");
            return numbers;
        }

        int[] result = new int[numbers.length - 1];

        for (int i = 0; i < index; i++)
        {
            result[i] = numbers[i];
        }

        for (int i = index; i < result.length; i++)
        {
            result[i] = numbers[i + 1];
        }

        return result;
    }

    static void updateElement(int[] numbers, int value, int newValue)
    {
        if (numbers.length == 0)
        {
            System.out.println("Array is Empty!!");
            return;
        }

        int index = -1;

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == value)
            {
                index = i;
                break;
            }
        }

        if (index == -1)
        {
            System.out.println("Value " + value + ", does not exist!!!");
        }
        else
        {
            numbers[index] = newValue;
        }
    }

    static void searchElement(int[] numbers, int target)
    {
        if (numbers.length == 0)
        {
            System.out.println("Array is Empty!!");
            return;
        }

        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == target)
            {
                System.out.println(target + " found at index " + i);
                return;
            }
        }

        System.out.println(target + " not found!!");
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 20, 30, 40, 50, 60, 70};
        printArrayElements(nums);

        nums = deleteAtStart(nums);
        printArrayElements(nums);

        // nums = deleteAtStart(new int[] {});

        nums = deleteAtEnd(nums);
        printArrayElements(nums);

        // nums = deleteAtEnd(new int[] {});
        // printArrayElements(nums);

        nums = deleteValue(nums, 40);
        printArrayElements(nums);

        // nums = deleteValue(new int[] {}, 40);
        // printArrayElements(nums);

        nums = deleteValue(nums, 400);
        printArrayElements(nums);

        updateElement(nums, 30, 500);
        printArrayElements(nums);

        searchElement(nums, 50);
        searchElement(nums, 100);
    }
}
