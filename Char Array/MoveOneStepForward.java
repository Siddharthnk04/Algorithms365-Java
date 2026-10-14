import java.util.Arrays;

public class MoveOneStepForward 
{
    static char[] moveOneStepForward(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return arr;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 'z' || arr[i] == 'Z')
                arr[i] = 'a';
            else if ((arr[i] >= 'a' && arr[i] < 'z') || (arr[i] >= 'A' && arr[i] < 'Z'))
                arr[i] = (char)(arr[i] + 1);
        }

        return arr;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'c','a','t','z'};

        System.out.println(Arrays.toString(moveOneStepForward(arr)));
    }
}
