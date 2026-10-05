public class StackAsArray 
{
    public static void main(String[] args) 
    {
        Stack myStack = new Stack(5);

        myStack.printStackElements();
        myStack.peak();
        myStack.pop();
        myStack.push(10);
        myStack.printStackElements();
        myStack.push(20);
        myStack.printStackElements();
        myStack.push(100);
        myStack.printStackElements();

        System.out.println(myStack.pop());
        myStack.printStackElements();

    }
}
