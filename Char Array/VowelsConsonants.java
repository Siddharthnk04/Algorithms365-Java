import java.util.Arrays;

public class VowelsConsonants 
{
    static int[] countVowelsAndConsonants(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return new int[] {-1, -1};

        int vowelCount = 0;
        int consonantCount = 0;

        for (char x : arr)
        {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'U' || x == 'I' || x == 'O')
                vowelCount++;
            else if ((x >= 'a' && x <='z') || (x >= 'A' && x <= 'Z'))
                consonantCount++;
        }

        return new int[] {vowelCount, consonantCount};
    }

    public static void main(String[] args) 
    {
        char[] arr = {'a','p','p','l','e'};
        
        System.out.println(Arrays.toString(countVowelsAndConsonants(arr)));
    }
}
