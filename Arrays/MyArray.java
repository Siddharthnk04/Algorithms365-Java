public class MyArray 
{
    int[] array; //Place to store elements
    int length; //Total size of the array
    int rightIndex; //Pointing to empty box

    //Constructor
    public MyArray()
    {
        length = 5;
        rightIndex = 0;
        array = new int[length]; // [0 , 0, 0, 0, 0]  --> Intitial array
    }

    //Print Array
    public void printArray()
    {
        if (rightIndex == 0)
        {
            System.out.println("Array is Empty!!!");
            return;
        }

        System.out.println("Index\tValue");
        for (int i = 0; i < length; i++)
        {
            System.out.println(i + "\t" + array[i]);
        }

        System.out.println("Size = " + rightIndex);

        System.out.println();
    }

    //Insert at End
    public void insertAtEnd(int value)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is full. Cannot insert.");
            return;
        }

        array[rightIndex] = value;
        rightIndex++;
        System.out.println(value + " inserted at end.");
    }

    //Insert At Start
    public void inserAtStart(int value)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is Full. Cannot insert.");
            return;
        }

        for (int i = rightIndex; i > 0; i--)
        {
            array[i] = array[i - 1];
        }

        array[0] = value;
        rightIndex++;
        System.out.println(value + " inserted at start.");
    }

    //Insert At position
    public void insertAtPosition(int value, int position)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is Full. Cannot insert.");
            return;
        }

        if (position < 0 || position > rightIndex)
        {
            System.out.println("Invalid position. Connot insert");
            return;
        }

        for (int i = rightIndex; i > position; i--)
        {
            array[i] = array[i - 1];
        }

        array[position] = value;
        rightIndex++;
        System.out.println(value + " inserted at position " + position + ".");
    }

    //Delete At Start
    public void deleteAtStart()
    {
        if (rightIndex == 0)
        {
            System.out.println("Array is Empty. Cannot delete.");
            return;
        }

        for (int i = 1; i < rightIndex; i++)
        {
            array[i-1] = array[i];
        }
        rightIndex--;   
        array[rightIndex] = 0;
        System.out.println("Deleted at start.");
    }

    //Delete At End
    public void deleteAtEnd()
    {
        if (rightIndex == 0)
        {
            System.out.println("Array is Empty. Cannot delete.");
            return;
        }

        rightIndex--;
        array[rightIndex] = 0;
        System.out.println("Deleted at end.");
    }

    //Delete At Position
    public void deleteAtPosition(int position)
    {
        if (rightIndex == 0)
        {
            System.out.println("Array is Empty. Cannot delete.");
            return;
        }

        if (position < 0 || position >= rightIndex)
        {
            System.out.println("Invalid position. Connot delete");
            return;
        }

        for (int i = position; i < rightIndex - 1; i++)
        {
            array[i] = array[i + 1];
        }

        rightIndex--;
        array[rightIndex] = 0;
        System.out.println("Deleted at position " + position + ".");
    }

    //Insert at position, unoedered array
    public void insertAtPositionUnordered(int value, int position)
    {
        if (rightIndex == length)
        {
            System.out.println("Array is Full. Cannot insert.");
            return;
        }

        if (position < 0 || position > rightIndex)
        {
            System.out.println("Invalid position. Connot insert");
            return;
        }

        array[rightIndex] = array[position];
        array[position] = value;
        rightIndex++;
    }
}
