public class Array
{
    public static void main(String[] args) 
    {
        MyArray myArray = new MyArray();
        myArray.insertAtEnd(10);
        myArray.printArray();

        myArray.inserAtStart(20);
        myArray.printArray();

        myArray.insertAtPosition(30, 0);
        myArray.printArray();

        myArray.insertAtPosition(40, 3);
        myArray.printArray();

        myArray.insertAtPosition(50, 3);
        myArray.printArray();

        myArray.insertAtPosition(30, 0);
        myArray.printArray();

        myArray.deleteAtStart();
        myArray.printArray();

        myArray.insertAtPositionUnordered(30, 2);
        myArray.printArray();
    }
}
