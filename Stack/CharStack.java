public class CharStack 
{
    char[] stack;
    int top;
    int maxSize;

    public CharStack(int size)
    {
        maxSize = size;
        stack = new char[size];
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

    public char peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is Empty!! Cannot peak");
            return '_';
        }
        else
        {
            return stack[top];
        }
    }

    public void push (char value)
    {
        if (top == maxSize - 1)
        {
            System.out.println("Stack is Full!! Cannot push");
            return;
        }

        top++;
        stack[top] = value;
    }

    public char pop ()
    {
        if (top == -1)
        {
            System.out.println("Stack is Empty!! Cannot pop.");
            return '_';
        }
  
        return stack[top--];
    }

    public boolean  isEmpty()
    {
        return top == -1;

    }
}
