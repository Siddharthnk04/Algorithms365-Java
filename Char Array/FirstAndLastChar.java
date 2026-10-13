import java.util.Arrays;

public class FirstAndLastChar 
{
    static char[] getFirstAndLastChar(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return arr;

        return new char[] {arr[0], arr[arr.length - 1]};
    }

    public static void main(String[] args) 
    {
        char[] arr = {'m','a','n','g','o'};

        System.out.println(Arrays.toString(getFirstAndLastChar(arr)));
    }
}
