public class PrintChars
{
    static void printCharacters(char[] message)
    {
        if (message == null || message.length == 0)
            return;

        for (char ch : message)
        {
            System.out.print(ch);
        }
    }

    public static void main(String[] args)
    {
        String msg = "Hi Hamza, How are you?";
        char[] message = msg.toCharArray();

        printCharacters(message);
    }
}