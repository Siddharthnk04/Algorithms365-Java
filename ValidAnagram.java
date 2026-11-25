public class ValidAnagram 
{
    public static boolean isValidAnagram(String s, String t)
    {
        if (s.length() != t.length())
            return false;

        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++)
        {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for (int x : frequency)
            if (x != 0)
                return false;
        
        return true;
    }


    public static boolean isValidAnagram(char[] s, char[] t)
    {
        if (s.length != t.length)
            return false;

        int[] frequency = new int[26];

        for (int i = 0; i < s.length; i++)
        {
            frequency[s[i] - 'a']++;
            frequency[t[i] - 'a']--;
        }

        for (int x : frequency)
            if (x != 0)
                return false;
        
        return true;
    }

    public static void main(String[] args) 
    {
        System.out.println(isValidAnagram("silent", "listen"));
    }    
}
