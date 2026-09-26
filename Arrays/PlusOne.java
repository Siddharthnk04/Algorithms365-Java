
import java.util.Arrays;

public class PlusOne
{
    static int[] puslOne(int[] digits)
    {
        int index = digits.length - 1;
        while (index > 0 && digits[index] == 9)
        {
            digits[index] = 0;
            index--;
        }

        if(index == 0 && digits[index] == 9)
        {
            int result[] = new int[digits.length + 1];
            result[0] = 1;
            return result; 
        }

        digits[index] += 1;

        return digits;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(puslOne(new int[] {8,9,9,9})));
    }
}