import java.util.Scanner;

public class EncryptDecript 
{
    static String encryptMessage(char[] msg)
    {
        String encrypedMessage = "";

        for (int i = 0; i < msg.length; i++)
        {
            encrypedMessage += (Integer.toHexString(msg[i] - 15));

            encrypedMessage += "+";
        }

        System.out.println(encrypedMessage);

        char[] temp = encrypedMessage.toCharArray();
        encrypedMessage = "";
        String seperator = "ghijklmnopqrstuvwxyz";
        int j = 0;

        for (int i = 0; i < temp.length; i++)
        {
            encrypedMessage += (Integer.toHexString(temp[i] + 15));
            encrypedMessage += seperator.charAt(j);
            j++;
            if (j == 19)
                j = 0;
        }

        return encrypedMessage;
    }

    static String decryptMessage(char[] msg)
    {
        String decrypedMessage = "";
        String current = "";

        for (int i = 0; i < msg.length; i++)
        {
            if (msg[i] < 'g')
                current += msg[i];
            else
            {
                decrypedMessage += (char)(Integer.parseInt(current, 16) - 15);
                current = "";
            }
        }

        char[] temp = decrypedMessage.toCharArray();
        decrypedMessage = "";

        for (int i = 0; i < temp.length; i++)
        {
            if (temp[i] != '+')
                current += temp[i];
            else
            {
                decrypedMessage += (char)(Integer.parseInt(current, 16) + 15);
                current = "";
            }
        }

        return decrypedMessage;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a message : ");
        String message = sc.nextLine();

        System.out.println("Original message : " + message);
        String encryptedMsg = encryptMessage(message.toCharArray());
        System.out.println("Encrypted message : " + encryptedMsg);
        String decryptedMsg = decryptMessage(encryptedMsg.toCharArray());
        System.out.println("Decrypted message : " + decryptedMsg);
    }
}
