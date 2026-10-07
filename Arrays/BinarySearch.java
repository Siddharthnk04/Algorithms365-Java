public class BinarySearch 
{
    static int binarySearch(int[] arr, int target)
    {
        if (arr == null || arr.length == 0)
        {
            return  -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }

            if (arr[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(binarySearch(arr, 50));
        System.out.println(binarySearch(arr, 55));
        System.out.println(binarySearch(null, 50));
        System.out.println(binarySearch(new int[] {}, 50));
    }
}
