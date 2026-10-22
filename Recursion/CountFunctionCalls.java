public class CountFunctionCalls 
{
    static int countFunctionCalls(int n)
    {
        int count = 1;

        if (n > 0)
            count += countFunctionCalls(n - 1);

        return count;
    }

    public static void main(String[] args) 
    {
        System.out.println(countFunctionCalls(4));
    }
    
}