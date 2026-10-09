public class NumberOfIslands 
{
    static int numIslands(char[][] grid) 
    {
        int[][] arr = new int[grid.length + 1][grid[0].length + 1];
        int islands = 0;

        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 1; j < arr[0].length; j++)
            {
                if (grid[i - 1][j - 1] == '1')
                    arr[i][j] = 1;
                else
                    arr[i][j] = 0;

                if (arr[i][j] == 1)
                {
                    if (arr[i - 1][j] == 0 && arr[i][j - 1] == 0)
                    {   
                        boolean newIsland = true;
                        int k = j;

                        while (k < grid[0].length - 1)
                        {
                            if (grid[i - 1][k] == '1' && arr[i - 1][k + 1] == 1)
                            {
                                newIsland = false;
                                break;
                            }
                            k++;
                        }
                        
                        if (newIsland)
                            islands++;
                    }
                }
            }
        }

        return islands;
    }

    public static void main(String[] args) 
    {
        // char[][] grid = {
        //     {'1','1','0','0','0'},
        //     {'1','1','0','0','0'},
        //     {'0','0','1','0','0'},
        //     {'0','0','0','1','1'}
        // };

        char[][] grid = {
            {'1','1','1'},
            {'0','1','0'},
            {'1','1','1'}
        };

        System.out.println(numIslands(grid));
    }
}

