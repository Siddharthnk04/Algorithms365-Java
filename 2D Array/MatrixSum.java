public class MatrixSum 
{
    static void printSumOfEachRow(int[][] A)
    {
        for (int[] x : A)
        {
            int sum = 0;

            for (int y : x)
                sum += y;

            System.out.println(sum);
        }
    }

    static void printSumOfEachCol(int[][] A)
    {
        for (int i = 0; i < A[0].length; i++)
        {
            int sum = 0;

            for (int j = 0; j < A.length; j++)
                sum += A[j][i];

            System.out.println(sum);
        }
    }

    public static void main(String[] args) 
    {
        int[][] A = {{1,2,3}, {4,5,6}, {7,8,9}};

        printSumOfEachRow(A);
        printSumOfEachCol(A);
    }
}
