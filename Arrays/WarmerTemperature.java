import java.util.Arrays;
import java.util.Stack;

public class WarmerTemperature 
{
    static int[] countNextWarmerTemperature(int[] temperatures)
    {
        if (temperatures == null || temperatures.length == 0)
        {
            return temperatures;
        }

        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++)
        {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
                result[stack.peek()] = i - stack.pop();

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println(Arrays.toString(countNextWarmerTemperature(temperatures)));
    }
}
