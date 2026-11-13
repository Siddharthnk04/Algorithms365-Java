public class QueueUsingLinkedList 
{

    int count = 0;
    int size = 0;
    ListNode first = null;
    ListNode last = null;
    

    public QueueUsingLinkedList(int queueSize)
    {
        this.size = queueSize;
    }

    public void enqueue(int value)
    {
        if (count == size)
        {
            System.out.println("Queue is full");
            return;
        }

        insertAtLast(value, last);
    }
}
