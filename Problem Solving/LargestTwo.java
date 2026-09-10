public class LargestTwo 
{
    public static void main(String[] args) 
    {
        int arr[] = new int[] {-10,-10,-10,-50, 100, 456};

        int maxFirst = arr[0];
        int maxSecond;
        
        int num;
        int i = 1;
        while(arr[i]==maxFirst)
        {
            i+=1;
        }
        maxSecond = arr[i];

        for(; i<arr.length;i++)
        {
            num = arr[i];
            if (num > maxSecond)
            {
                if (num > maxFirst)
                {
                    maxSecond = maxFirst;
                    maxFirst = num;
                }
                else
                {
                    maxSecond = num;
                }
            }
        }
        System.out.println("MaxFirst : " + maxFirst);
        System.out.println("MaxSecond : " + maxSecond);
    }
}
