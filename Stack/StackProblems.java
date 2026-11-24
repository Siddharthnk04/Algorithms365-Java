import java.util.Arrays;

public class StackProblems 
{
    public static void printUsingPeek(MyStack stack)
    {
        int i = 1;
        while (stack.peek(i) != -1)
            System.out.println(stack.peek(i++));
    }

    public static void reverseArray(int[] arr)
    {
        MyStack stack = new MyStack(arr.length);

        for (int x : arr)
        {
            stack.push(x);
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = stack.pop();
    }

    public static String reverseString(String str)
    {
        MyStack stack = new MyStack(str.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty())
        {
            sb.append((char)stack.pop());
        }

        return sb.toString();
    }

    public static int getMaxElement(MyStack stack)
    {
        int largest = Integer.MIN_VALUE;

        for (int i = 1; stack.peek(i) != -1; i++)
            largest = Math.max(largest, stack.peek(i));

        return largest;
    }

    public static void main(String[] args) 
    {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        printUsingPeek(stack);
        stack.displayBottom();

        int[] arr = {10, 20, 30, 40, 50};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(reverseString("string"));

        System.out.println(getMaxElement(stack));
    }
}
