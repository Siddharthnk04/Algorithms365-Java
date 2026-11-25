public class StackUsingLinkedListImplementation 
{
    public static void main(String[] args) 
    {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());

        System.out.println(stack.peek(5));

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

        stack.pop();
        System.out.println(stack.peek());
        stack.display();


        System.out.println(stack.peek(5));
        System.out.println(stack.peek(4));
        System.out.println(stack.peek(3));
        System.out.println(stack.peek(2));
        System.out.println(stack.peek(1));
        System.out.println(stack.peek(0));
        System.out.println(stack.peek(-1));
        
    }
}
