public class SameElementAtSamePosition 
{
    static int countSameElementsAtSamePosition(char[] arr1, char[] arr2)
    {
        if (arr1 == null || arr2 == null || arr1.length == 0)
            return -1;

        int count = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] == arr2[i])
                count++;
        }

        return count;
    }

    public static void main(String[] args) 
    {
        char[] arr1 = {'c','1','a','r','d'};
        char[] arr2 = {'c','1','o','r','e'};

        System.out.println(countSameElementsAtSamePosition(arr1, arr2));
    }
}
