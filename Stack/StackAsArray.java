public class StackAsArray 
{
    public static void main(String[] args) 
    {
        Stack myStack = new Stack(5);
        Stack stack = new Stack(3);

        myStack.printStackElements();
        myStack.peek();
        myStack.pop();
        myStack.push(10);
        myStack.printStackElements();
        myStack.push(20);
        myStack.printStackElements();
        myStack.push(100);
        myStack.printStackElements();

        stack.printStackElements();
        stack.push(100);
        stack.printStackElements();

        System.out.println(myStack.pop());
        myStack.printStackElements();
        System.out.println(myStack.pop());
    }
}
