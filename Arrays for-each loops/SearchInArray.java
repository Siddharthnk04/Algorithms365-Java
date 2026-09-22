public class SearchInArray 
{
    /*static boolean searchElement(int arr[], int key)
    {
        for (int x : arr)
        {
            if (x == key)
                return true;
        }

        return false;
    }*/

    boolean searchElement(int arr[], int key)
    {
        for (int x : arr)
        {
            if (x == key)
                return true;
        }

        return false;
    }

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};

        SearchInArray obj = new SearchInArray();

        System.out.println(obj.searchElement(arr, 30));
        System.out.println(obj.searchElement(arr, 100));
    }
}
