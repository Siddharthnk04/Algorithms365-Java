public class Queue
{
    int[] queue;
    int size;
    int first = 0;
    int last = 0;
    int count = 0;

    public Queue(int queueSize)
    {
        this.size = queueSize;
        this.queue = new int[queueSize];
    }

    public void enqueue(int value)
    {
        // Queue is Full
        if (count == size)
        {
            System.out.println("Queue is Full");
            return;
        }

        // Queue is not full but last reached the end
        if (last == size)
        {
            for (int i = 0; i < count; i++)
                queue[i] = queue[i + first];
            first = 0;
            last = count;
        }

        // Adding element
        queue[last] = value;
        last++;
        count++;
    }

    public int dequeue()
    {
        // Queue is Empty
        if (count == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }

        // Deleteing element
        count--;
        return queue[first++];
    }

    public int peek()
    {
        // Queue is empty
        if (count == 0)
        {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[first];
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public int getCount()
    {
        return count;
    }
}