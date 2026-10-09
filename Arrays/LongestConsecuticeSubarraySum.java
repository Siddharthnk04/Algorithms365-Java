import java.util.HashMap;

public class LongestConsecuticeSubarraySum 
{
    static int getLongestSubarrayLengthWhoseSumEqualsKey(int[] nums, int key)
    {
        if (nums == null)
            return -1;

        HashMap <Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++)
        {
            prefixSum += nums[i];

            if (prefixSum == key)
                maxLength = i + 1;

            if (map.containsKey(prefixSum - key))
            {                
                if ((i - map.get(prefixSum - key)) > maxLength)
                    maxLength = i - map.get(prefixSum - key);
            }

            if (!map.containsKey(prefixSum))
                map.put(prefixSum, i);
        }

        return maxLength;
    }

    public static void main(String[] args) 
    {
        int nums[] = {1, -1, 5, -2, 3};

        System.out.println(getLongestSubarrayLengthWhoseSumEqualsKey(nums, 3));
    }
}
