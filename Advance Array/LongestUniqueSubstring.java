
import java.util.HashMap;

public class LongestUniqueSubstring 
{
    static int lengthOfLongestSubstring(char[] str)
    {
        if (str == null || str.length == 0)
            return 0;

        HashMap <Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right < str.length)
        {
            if (!map.containsKey(str[right]))
                map.put(str[right], right);
            else
            {
                maxLength = Math.max(right - left, maxLength);

                left = Math.max(left, map.get(str[right]) + 1);
                map.put(str[right], right);
            }
            right++;
        }

        return Math.max(maxLength, right - left);
    }

    public static void main(String[] args) 
    {
        char[] str = {'a', 'b', 'c', 'b', 'd', 'e', 'b'};

        System.out.println(lengthOfLongestSubstring(str));
    }
}
