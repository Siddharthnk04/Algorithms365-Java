public class MobileNumber 
{
    static boolean isMobileNumber(char[] number)
    {
        if (number == null || number.length != 10)
            return false;

        for (char ch : number)
        {
            if (ch < '0' || ch > '9')
                return false;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        char[] number = {'9','8','4','5','0','1','2','3','4','5'};

        System.out.println(isMobileNumber(number));
    }
}
