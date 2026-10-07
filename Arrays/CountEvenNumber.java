public class CountEvenNumber 
{
    static int countEvenNumbers(int[] nums)
    {
        if (nums == null || nums.length == 0)
            return -1;

        int evenCount = 0;

        for (int number : nums)
        {
            if (number % 2 == 0)
                evenCount++;
        }

        return evenCount;
    }

    public static void main(String[] args) {
        int[] nums = {2, 10, 5, 56, 17, 230};

        System.out.println(countEvenNumbers(nums));

        int[] nums1 = {10, 25, 6, 51, 2};
        System.out.println(countEvenNumbers(nums1));
        System.out.println(countEvenNumbers(null));
        System.out.println(countEvenNumbers(new int[] {}));

    }
}
