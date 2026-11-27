public class TestMyQueue 
{
    public static void main(String[] args) 
    {
        MyQueue queue = new MyQueue(5);
        
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.isFull());

        // queue.first();
        // queue.last();
        // queue.display();

        // queue.enQueue(10);
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.first());
        // System.out.println(queue.last());

        // queue.enQueue(20);
        // queue.enQueue(30);
        // queue.enQueue(40);
        // queue.enQueue(50);

        // System.out.println(queue.isEmpty());
        // System.out.println(queue.isFull());
        // System.out.println(queue.first());
        // System.out.println(queue.last());
        // queue.display();

        // System.out.println(queue.deQueue());
        // System.out.println(queue.deQueue());

        // System.out.println();
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.isFull());
        // System.out.println(queue.first());
        // System.out.println(queue.last());
        // queue.display();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.display();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.display();

        queue.enQueue(100);
        queue.enQueue(150);
        queue.display();
    }
}
