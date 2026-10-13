public class CharacterFrequency 
{
    static int countCharacterFrequency(char[] arr, char ch)
    {
        if (arr == null || arr.length == 0)
            return -1;

        int count = 0;

        for (char x : arr)
        {
            if (x == ch)
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        char[] ch = {'b','a','n','a','n','a'};
        
        System.out.println(countCharacterFrequency(ch, 'a'));
    }
}
