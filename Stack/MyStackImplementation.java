public class MyStackImplementation 
{
    public static void main(String[] args) 
    {
        MyStack stack = new MyStack(5);

        stack.pop();
        stack.peek(3);
        stack.stackTop();
        stack.push(10);
        stack.peek(3);
        stack.push(20);
        stack.display();
        System.out.println(stack.peek(1));
        stack.peek(6);

        stack.push(40);
        stack.push(30);
        stack.push(50);
        stack.push(60);
        
        stack.display();
        stack.pop();
        stack.peek(-5);
        stack.peek(3);
        stack.peek(4);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println();
        stack.display();
    }
}
