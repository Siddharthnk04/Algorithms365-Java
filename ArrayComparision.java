public class ArrayComparision 
{
    static void compareNumber(int[] numbers, int number)
    {
        if (numbers == null)
        {
            System.out.println("Array is null!! Cannot compare.");
            return;
        }
        if (numbers.length == 0)
        {
            System.out.println("Array is empty!! Cannot compare.");
            return;
        }

        for (int x : numbers)
        {
            if (number > x)
            {
                System.out.println(number + " > " + x);
            }
            else if (number == x)
            {
                System.out.println(number + " == " + x);
            }
            else
            {
                System.out.println(number + " < " + x);
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] array = null;
        int[] numbers = {40, 10, 30, 20, 30};
        int number = 30;

        compareNumber(array , number);
        compareNumber(numbers, number);
    }
}
