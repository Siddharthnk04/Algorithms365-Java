import java.util.Arrays;
import java.util.HashSet;

public class CharactersNotPresentInSecondArray 
{
    static char[] getCharactersNotPresentInSecondArray(char[] arr1, char[] arr2)
    {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0)
            return arr1;

        HashSet <Character> set = new HashSet<>();

        for (char ch : arr2)
            set.add(ch);

        int count = 0;

        for (char ch : arr1)
        {
            if (!set.contains(ch))
                count++;
        }

        char[] result = new char[count];
        int index = 0;

        for (char ch : arr1)
        {
            if (!set.contains(ch))
            {
                result[index] = ch;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) 
    {
        char[] arr1 = {'a','b','c','d','e'};
        char[] arr2 = {'b','d'};

        System.out.println(Arrays.toString(getCharactersNotPresentInSecondArray(arr1, arr2)));
    }
}
