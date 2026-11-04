public class QueueUsingStack 
{
    Stack stack1 = new Stack(5);
    Stack stack2 = new Stack(5);

    void enqueue(int val)
    {
        stack1.push(val);
    }

    int dequeue()
    {
        if (stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("Queue is empty !!!");
            return -1;
        }

        if (stack2.isEmpty())
        {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

    int peek()
    {
        if (stack1.isEmpty() && stack2.isEmpty())
        {
            System.out.println("Queue is empty !!!");
            return -1;
        }

        if (stack2.isEmpty())
        {
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.peek();        
    }


    public static void main(String[] args) 
    {
        QueueUsingStack queue = new QueueUsingStack();

        queue.peek();
        queue.dequeue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 

        queue.enqueue(50);

        System.out.println(queue.peek());    
        System.out.println(queue.dequeue());  
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
    }
}
