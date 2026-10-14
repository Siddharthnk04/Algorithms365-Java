import java.util.Arrays;

public class IndicesOfGivenCharacter 
{
    static int[] getIndicesOfGivenChar(char[] arr, char key)
    {
        if (arr == null || arr.length == 0)
            return new int[] {-1};

        int count = 0;

        for (char ch : arr)
        {
            if (ch == key)
                count++;
        }

        int[] result = new int[count];

        for (int i = arr.length - 1; i > -1; i--)
        {
            if (arr[i] == key)
            {
                result[--count] = i;
            }
        }

        return result;
    }


    public static void main(String[] args) 
    {
        char[] arr = {'h','e','l','l','o'};

        System.out.println(Arrays.toString(getIndicesOfGivenChar(arr, 'l')));
    }
}
