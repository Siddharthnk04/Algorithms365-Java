import java.util.Arrays;

public class RemoveVowels 
{
    static char[] removeVowels(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return arr;

        int vowelCount = 0;
        
        for (char x : arr)
        {
            if (isVowel(x))
                vowelCount++;
        }

        char[] newArr = new char[arr.length - vowelCount];
        int index = 0;

        for (char x : arr)
        {
            if (isVowel(x))
                continue;

            newArr[index] = x;
            index++;
        }

        return newArr;
    }

    static boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) 
    {
        char[] arr = {'p','r','o','g','r','a','m'};

        System.out.println(Arrays.toString(removeVowels(arr)));
    }
}
