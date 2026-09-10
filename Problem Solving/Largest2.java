public class Largest2 
{
    public static void main(String[] args) 
    {
        int arr[] = {10, 20, 20, 15, 10};

        int maxFirst = arr[0];
        int maxSecond = arr[0];
        
        int num;

        for(int i =1; i<arr.length;i++)
        {
            num = arr[i];
            if (num > maxSecond)
            {
                if (num > maxFirst)
                {
                    maxSecond = maxFirst;
                    maxFirst = num;
                }
                else if (num != maxFirst)
                {
                    maxSecond = num;
                }
            }
            else if (maxFirst == maxSecond)
            {
                maxSecond = num;
            }
        }
        System.out.println("MaxFirst : " + maxFirst);
        System.out.println("MaxSecond : " + maxSecond);
    }
}
