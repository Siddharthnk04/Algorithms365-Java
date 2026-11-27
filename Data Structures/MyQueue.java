public class MyQueue 
{
    int front;
    int rear;
    int[] queue;
    int size;

    public MyQueue(int queueSize)
    {
        size = queueSize;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enQueue(int value)
    {
        if (isFull())
        {
            System.out.println("Queue is Full. Cannot enqueue!!!");
            return;
        }

        if (rear == size - 1)
        {
            for (int i = 0; i < count(); i++)
            {
                queue[i] = queue[front + 1 + i];
            }

            rear = count() - 1;
            front = -1;
        }

        queue[++rear] = value;
        System.out.println(value + " inserted.");
    }

    public int deQueue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty. Cannot dequeue!!!");
            return -1;
        }

        return queue[++front];
    }

    public boolean isFull()
    {
        return count() == size;
    }

    public boolean isEmpty()
    {
        return count() == 0;
    }

    public int first()
    {
        if (isEmpty())
        {
            System.out.println("Queue is Empty!!!");
            return -1;
        }

        return queue[front + 1];
    }

    public int last()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty!!!");
            return -1;
        }

        return queue[rear];
    }

    public int count()
    {
        // returns number of elements present in the queue
        return rear - front; 
    }

    public void display()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty!!!");
            return;
        }

        System.out.println();
        System.out.println("Queue Elements");

        for (int i = front + 1; i <= rear; i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }


}
