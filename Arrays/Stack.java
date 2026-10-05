public class Stack 
{
    int[] stack;
    int top;
    int maxSize;

    public Stack(int size)
    {
        maxSize = size;
        stack = new int[size];
        top = -1;
    }

    public void printStackElements()
    {
        if (top == -1)
        {
            System.out.println("Stack is Empty.");
            return;
        }

        int temp = top;
        System.out.println("\nStack Elements : ");
        while(temp >= 0)
        {
            System.out.println(stack[temp]);
            temp--;
        }
        System.out.println();
    }

    public void peak()
    {
        if (top == -1)
        {
            System.out.println("Stack is Empty!! Cannot peak");
        }
        else
        {
            System.out.println(stack[top]);
        }
    }

    public void push (int value)
    {
        if (top == maxSize - 1)
        {
            System.out.println("Stack is Full!! Cannot push");
            return;
        }

        top++;
        stack[top] = value;
    }

    public int pop ()
    {
        if (top == -1)
        {
            System.out.println("Stack is Empty!! Cannot pop.");
            return -1;
        }

        int val = stack[top];
        top--;
        return val;
    }
}
