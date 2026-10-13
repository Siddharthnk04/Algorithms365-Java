public class ArrayContainsDigit 
{
    static boolean isDigitPresent(char[] arr)
    {
        if (arr == null || arr.length == 0)
            return false;

        for (char ch : arr)
        {
            if (ch >= '0' && ch <= '9')
                return true;
        }

        return false;
    }

    public static void main(String[] args) 
    {
        char[] arr = {'p','a','s','s','1'};

        System.out.println(isDigitPresent(arr));
    }
}
