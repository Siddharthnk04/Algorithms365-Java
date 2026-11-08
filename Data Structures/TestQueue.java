public class TestQueue 
{
    public static void main(String[] args) 
    {
        Queue queue = new Queue(5);

        queue.peek();
        queue.dequeue();
        queue.isEmpty();
        queue.getCount();
        queue.enqueue(5);
        queue.enqueue(9);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
    }
}
