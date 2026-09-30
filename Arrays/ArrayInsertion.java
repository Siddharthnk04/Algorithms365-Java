public class ArrayInsertion 
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

    static int[] insertAtBegining(int[] numbers, int data)
    {
        int[] nums = new int[numbers.length + 1];

        nums[0] = data;
        for (int i = 1; i < nums.length; i++)
        {
            nums[i] = numbers[i - 1];
        }

        return nums;
    }

    static int[] insertAtEnd(int[] numbers, int data)
    {
        int[] nums = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++)
        {
            nums[i] = numbers[i];
        }

        nums[nums.length - 1] = data;

        return nums;
    }

    static int[] insertAfterValue(int[] numbers, int value, int data)
    {
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

        int[] nums = new int[numbers.length + 1];

        for (int i = 0; i <= index; i++)
        {
            nums[i] = numbers[i];
        }

        nums[index + 1] = data;
        index++;

        for (; index < numbers.length; index++)
        {
            nums[index + 1] = numbers[index];
        }

        return nums;
    }

    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30};
        printArrayElements(numbers);

        //Insert At Begining
        numbers = insertAtBegining(numbers, 100);
        printArrayElements(numbers);

        //Insert at End
        numbers = insertAtEnd(numbers, 200);
        printArrayElements(numbers);

        //Insert inBetween
        numbers = insertAfterValue(numbers, 20, 500);
        printArrayElements(numbers);
    }
}
