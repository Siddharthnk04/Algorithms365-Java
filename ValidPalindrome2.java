public class ValidPalindrome2 
{
    static boolean isValidPalindrome2(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        boolean flag = true;
        while (left < right)
        {
            if (s.charAt(left) != s.charAt(right))
            {
                if (flag)
                {
                    left++;
                    if (s.charAt(left) != s.charAt(right))
                    {
                        left--;
                        right--;

                        if (s.charAt(left) != s.charAt(right))
                        {
                            return false;
                        }
                    }

                    flag = false;
                }
                else
                {
                    return false;
                }
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) 
    {
        System.out.println(isValidPalindrome2("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
