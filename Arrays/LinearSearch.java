
public class LinearSearch 
{
    static boolean linearSearch(int[] nums, int key)
    {
        if (nums == null)
            return false;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == key)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter size of the array : ");
        // int size = sc.nextInt();

        // int[] array = new int[size];

        // System.out.println("Enter array elements : ");
        // for (int i = 0; i < size; i++)
        // {
        //     array[i] = sc.nextInt();
        // }

        // System.out.print("Enter a number to search : ");
        // int key = sc.nextInt();

        int[] nums = {10, 51, 25, 30, 40};
        System.out.println(linearSearch(nums, 30));
        System.out.println(linearSearch(nums, 100));
        System.out.println(linearSearch(null, 30));
        System.out.println(linearSearch(new int[] {}, 30));
    }
}
