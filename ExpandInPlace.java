// Expand string in place.
// a3b2c  ==>  aaabbc
// The char array contains enough space for expansion
// The array does not contains 0 or 1


import java.util.Arrays;

public class ExpandInPlace 
{
    static int findReadIndex(char[] str)
    {        
        for (int i = 0; i < str.length; i++)
        {
            if (str[i] == Character.MIN_VALUE)
                return i - 1;
        }

        return str.length - 1;
    }

    static int calculateWriteIndex(char[] str, int readIndex)
    {
        int count = 0;

        for (int i = 0; i <= readIndex; i++)
        {
            if (str[i] >= '2' && str[i] <= '9')
                count = count + (str[i] - '0') - 1;
            else
                count++;
        }

        return count - 1;
    }

    static int copyCharFromRightToLeft(char[] str, char ch, int count, int writeIndex)
    {
        while (count > 0)
        {
            str[writeIndex] = ch;
            writeIndex--;
            count--;
        }

        return writeIndex;
    }

    static void expandString(char[] str)
    {
        if (str == null || str.length == 0)
            return;

        int readIndex = findReadIndex(str);

        // If the length of array is exactly equal to output string, then writeIndex 
        // will be length - 1. Or else we need to calculate writeIndex.

        // int writeIndex = str.length - 1;
        int writeIndex = calculateWriteIndex(str, readIndex);

        while (writeIndex >= 0)
        {
            if (str[readIndex] >= '2' && str[readIndex] <= '9')
            {
                int count = str[readIndex] - '0';
                writeIndex = copyCharFromRightToLeft(str, str[readIndex - 1], count, writeIndex);
                readIndex--;
            }
            else
            {
                str[writeIndex] = str[readIndex];
                writeIndex--;
            }

            readIndex--;
        }
    }


    public static void main(String[] args) 
    {
        char[] str = {'a','3','b','2','c',Character.MIN_VALUE};
        System.out.println(Arrays.toString(str));

        expandString(str);
        System.out.println(Arrays.toString(str));
    }
}
