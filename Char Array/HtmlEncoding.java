// I/p : http://a.com/b form/ submit
// o/p : http://a.com/b%20form/%20submit
// Replace ' ' with '%''2''0' InPlace
// There will be enough space for expansion

import java.util.Arrays;

public class HtmlEncoding 
{
    static int findReadIndex(char[] url)
    {
        for (int i = 0; i < url.length; i++)
        {
            if (url[i] == Character.MIN_VALUE)
                return i - 1;
        }

        return url.length;
    }

    static int calculateWriteIndex(char[] url, int readIndex)
    {
        int spaceCount = 0;

        for (int i = 0; i <= readIndex; i++)
        {
            if (url[i] == ' ')
                spaceCount++;
        }

        return readIndex + (spaceCount * 2);
    }

    static int replaceSpace(char[] url, int writeIndex)
    {
        url[writeIndex--] = '0';
        url[writeIndex--] = '2';
        url[writeIndex--] = '%';

        return writeIndex;
    }

    static void performHtmlEncoding(char[] url)
    {
        if (url == null || url.length == 0)
            return;

        int readIndex = findReadIndex(url);

        if (readIndex == url.length)
            return;

        int writeIndex = calculateWriteIndex(url, readIndex);

        while (readIndex >= 0)
        {
            if (url[readIndex] == ' ')
            {
                writeIndex = replaceSpace(url, writeIndex);
            }
            else
            {
                url[writeIndex] = url[readIndex];
                writeIndex--;
            }

            readIndex--;
        }
    }

    public static void main(String[] args) 
    {
        char[] url = {'h','t','t','p',':','/','/','a','.','c','o','m','/','b',' ',
        'f','o','r','m',' ',Character.MIN_VALUE,Character.MIN_VALUE,Character.MIN_VALUE,Character.MIN_VALUE};

        System.out.println(url.length);
        System.out.println(Arrays.toString(url));

        performHtmlEncoding(url);
        System.out.println(Arrays.toString(url));
    }
}
