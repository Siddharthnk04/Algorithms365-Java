public class StringProblems 
{
    public static void extratUsernameFromEmail()
    {
        String email = "siddharthnaik@gmail.com";

        System.out.println(email.substring(0, email.indexOf('@')));
        System.out.println(email.substring(email.indexOf('@') + 1, email.indexOf('.')));
        System.out.println(email.substring(email.indexOf('.') + 1));
    }

    public static void isHexaDecimal()
    {
        String str = "3a8a45";

        System.out.println(str.matches("[0-9a-fA-F]*"));
    }

    public static void isValidDateFormat()
    {
        String date = "01/12/2001";

        // if (date.length() == 10 && date.indexOf('/') == 2 && date.lastIndexOf('/') == 5)
        //     System.out.println("true");
        // else
        //     System.out.println("false");
        System.out.println(date.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));

    }

    public static void main(String[] args) 
    {
        extratUsernameFromEmail();
        isHexaDecimal();
        isValidDateFormat();
    }
}
