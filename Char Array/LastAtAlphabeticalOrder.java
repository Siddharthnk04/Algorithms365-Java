public class LastAtAlphabeticalOrder 
{
    static char getLetterThatComesLastInAlphabeticalOrder(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return '?';

        int index = 0;

        while (index < arr.length && !isLetter(arr[index]))
            index++;

        if (index == arr.length)
            return '!';

        char last = arr[index];

        for (int i = index + 1; i < arr.length; i++)
        {
            if (isLetter(arr[i]) && (Character.toLowerCase(arr[i]) > Character.toLowerCase(last)))
                last = arr[i];
        }

        return last;
    }

    static boolean isLetter(char ch)
    {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static void main(String[] args) 
    {
        char[] arr = {'d','o','g','s'};

        System.out.println(getLetterThatComesLastInAlphabeticalOrder(arr));
    }
}
