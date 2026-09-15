

public class AsciiAtoZ 
{
    void ascii()
    {
        for (char ch = 'A'; ch <= 'Z'; ch++)
            System.out.print(ch + " ");

        System.out.println();

        for (char ch = 'a'; ch <= 'z'; ch++)
            System.out.print(ch + " ");
    }

    public static void main(String[] args) 
    {
        AsciiAtoZ obj = new AsciiAtoZ();

        obj.ascii();
    }
}
