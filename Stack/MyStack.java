public class MyStack 
{
    int size;
    int top;
    int stack[];

    public MyStack(int stackSize)
    {
        this.size = stackSize;
        this.stack = new int[this.size];
        this.top = -1;
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return  top == size - 1;
    }

    public void push(int value)
    {
        if (isFull())
            return;

        stack[++top] = value;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty. Cannot pop!!!");
            return -1;
        }

        return stack[top--];
    }

    public int peek(int position)
    {
        int index = top - position + 1;

        if (index < 0 || index > top)
        {
            System.out.println("Invalid Position!!!");
            return -1;
        }

        return stack[index];
    }

    public int stackTop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is empty!!!");
            return -1;
        }

        return stack[top];
    }

    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty!!!");
            return;
        }

        System.out.println();

        System.out.println("Stack Elements");
        for (int i = top; i > -1; i--)
        {
            System.out.println(stack[i]);
        }
        System.out.println();
    }

    public void displayBottom()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty!!!");
            return;
        }

        System.out.println();

        System.out.println("Stack Elements");
        
        for (int i = 0; i <= top; i++)
        {
            System.out.println(stack[i]);
        }
        System.out.println();
    }
}
