public class CountCapitalLetters 
{
    static int countCapitalLetters(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return -1;

        int count = 0;

        for (int ch : arr)
        {
            if (ch >= 'A' && ch <= 'Z')
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'I','n','d','i','a','N','o','1'};

        System.out.println(countCapitalLetters(arr));
    }
}
