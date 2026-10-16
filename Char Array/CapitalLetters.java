import java.util.Arrays;

public class CapitalLetters 
{
    static char[] convertToCapital(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return arr;

        char[] res = new char[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 'a' && arr[i] <= 'z')
                res[i] = (char)(arr[i] - 32);
            else
                res[i] = arr[i];
        }

        return res;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'c','o','d','e'};

        System.out.println(Arrays.toString(convertToCapital(arr)));
    }
}
