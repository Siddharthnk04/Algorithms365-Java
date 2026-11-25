public class StackUsingLinkedList 
{
    int data;
    StackUsingLinkedList next;
    StackUsingLinkedList top = null;

    public StackUsingLinkedList createNode (int value)
    {
        StackUsingLinkedList newNode = new StackUsingLinkedList();
        newNode.data = value;
        newNode.next = null;

        return newNode;
    }

    public boolean isEmpty()
    {
        return top == null;
    }
    
    public void push(int value)
    {
        StackUsingLinkedList newNode = createNode(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty. cannot pop!!!");
            return -1;
        }

        int temp = top.data; // Strores value before deleting
        top = top.next; // Delete top value
        return temp; //return stored value
    }

    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty!!!");
            return -1;
        }

        return top.data;
    }

    // Customized peek
    public int peek(int position)
    {
        if (position < 1)
        {
            System.out.println("Invalid position");
            return -1;
        }
        StackUsingLinkedList temp = top;

        while (temp != null)
        {
            if (position-- == 1)
                return temp.data;

            temp = temp.next;
        }

        System.out.println("Invalid position");
        return -1;
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

        StackUsingLinkedList temp = top;

        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

        System.out.println();
    }
}
