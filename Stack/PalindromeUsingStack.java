public class PalindromeUsingStack 
{
    static boolean isPalindrome(int[] nums)
    {
        Stack stack = new Stack(nums.length / 2);

        int index = 0;

        while (index < nums.length / 2) { 
            stack.push(nums[index++]);
        }
        
        if (nums.length % 2 == 1)
            index++;

        while(index < nums.length)
        {
            if (nums[index++] != stack.pop())
                return false;
        }

        return true;  
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 20, 30, 30, 20, 10};

        System.out.println(isPalindrome(nums));
    }
}
