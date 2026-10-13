public class NumberOfWords 
{
    static int countNumberOfWords(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return -1;

        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != ' ' && (i == 0 || arr[i - 1] == ' '))
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'I',' ','l','o','v','e',' ','J','a','v','a'};

        System.out.println(countNumberOfWords(arr));
    }
}
