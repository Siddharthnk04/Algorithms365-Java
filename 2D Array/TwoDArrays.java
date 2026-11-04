public class TwoDArrays
{
    static void print2DArray(int[][] data)
    {
        System.out.println();
        
        for (int row = 0; row < data.length; row++)
        {
            for (int col = 0; col < data[row].length; col++)
            {
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void printParticularRow(int[][] data, int row)
    {
        if (data == null)
            return;

        if (row < 1 || row > data.length)
            return;

        for (int col = 0; col < data[row - 1].length; col++)
        {
                System.out.print(data[row - 1][col] + " ");
        }
        System.out.println();
    }

    static void printParticularColumn(int[][] data, int col)
    {
        if (data == null || data.length == 0)
            return;

        if (col < 1 && col > data[0].length)
            return;

        for (int row = 0; row < data.length; row++)
        {
            if (col < data[row].length)
                System.out.println(data[row][col - 1]);
        }
        
    }

    static void printDiagonal(int[][] data)
    {
        for (int row = 0; row < data.length; row++)
        {
            for (int col = 0; col < data[row].length; col++)
            {
                if (row == col)
                    System.out.println(data[row][col]);
            }
        }
    }

    static void changeMatrix(int[][] data)
    {
        // for (int col = 0; col < data[0].length; col++)
        //     System.out.print(data[0][col] + " ");
        // System.out.println();

        // for (int row = 0; row < data.length; row++)
        //     System.out.print(data[row][0] + " ");
        // System.out.println();

        // for (int row = 0; row < data.length; row++)
        //     System.out.print(data[row][data[row].length - 1] + " ");
        // System.out.println();

        // for (int col = 0; col < data[data.length - 1].length; col++)
        //     System.out.print(data[data.length - 1][col] + " ");
        // System.out.println();

        for (int row = 0; row < data.length; row++)
        {
            for (int col = 0; col < data[row].length; col++)
            {
                if (row == 0 || row == data.length - 1 || col == 0 || col == data[row].length - 1)
                    System.out.print(data[row][col] + " ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    static void changeMatrix2(int[][] data)
    {
        for (int col = 0; col < data[0].length; col++)
            System.out.print(data[0][col] + " ");
        System.out.println();

        for (int row = data.length - 1; row > -1; row--)
            System.out.print(data[row][0] + " ");
        System.out.println();

        for (int row = 0; row < data.length; row++)
            System.out.print(data[row][data[row].length - 1] + " ");
        System.out.println();

        for (int col = data[data.length - 1].length - 1; col > -1; col--)
            System.out.print(data[data.length - 1][col] + " ");
        System.out.println();
    }

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

            for (int i = colEnd; i >= colStart; i--)
            {
                System.out.print(data[rowEnd][i] + " ");
                n--;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--)
            {
                System.out.print(data[i][colStart] + " ");
                n--;
            }
            colStart++;
        }
    }

    public static void main(String[] args) 
    {
        int[][] data = {
                    {11, 12, 13, 14, 15},
                    {21, 22, 23, 24, 25},
                    {31, 32, 33, 34, 35},
                    {41, 42, 43, 44, 45},
                    {51, 52, 53, 54, 55}
                    };

        int[][] data1 = {
                    {11, 12, 13},
                    {21, 22, 23},
                    {31, 32, 33}
                    };

        print2DArray(data);

        // printParticularRow(data, 2);
        // printParticularColumn(data, 2);

        // System.out.println();
        // changeMatrix(data);
        // System.out.println();
        // changeMatrix2(data);

        printSpiralmatrix(data);

    }
}