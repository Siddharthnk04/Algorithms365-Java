import java.util.Arrays;

public class ReplaceSpaceWith_ 
{
    static char[] replaceSpaceWithUnderscore(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return arr;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ' ')
                arr[i] = '_';
        }

        return arr;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'h','i',' ','t','h',' ','e','r','e'};

        System.out.println(Arrays.toString(replaceSpaceWithUnderscore(arr)));
    }
}
