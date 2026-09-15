public class SearchElement 
{
    static void searchMatch(int a[], int n)
    {
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] == n)
            {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 30, 50};

        searchMatch(arr, 30);
        searchMatch(arr, 40);
    }
}
