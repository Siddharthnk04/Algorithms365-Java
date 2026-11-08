public class SpiralMatrix 
{
    static void printSpiralmatrix(int[][] data)
    {
        int n = data.length * data[0].length;
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = data.length - 1;
        int colEnd = data[0].length - 1;

        while (n > 0)
        {
            for (int i = colStart; i <= colEnd; i++)
            {
                System.out.print(data[rowStart][i] + " ");
                n--;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++)
            {
                System.out.print(data[i][colEnd] + " ");
                n--;
            }
            colEnd--;

            if (rowStart <= rowEnd)
            {
                for (int i = colEnd; i >= colStart; i--)
                {
                    System.out.print(data[rowEnd][i] + " ");
                    n--;
                }
                rowEnd--;
            }

            if (colStart <= colEnd)
            {
                for (int i = rowEnd; i >= rowStart; i--)
                {
                    System.out.print(data[i][colStart] + " ");
                    n--;
                }
                colStart++;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[][] A = {{3,5,9}, {7,6,2}, {4,8,1}};

        printSpiralmatrix(A);
        
    }
}
