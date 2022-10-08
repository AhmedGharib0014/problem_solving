class Solution {
    public int numIslands(char[][] grid) {
        int numberOfIsland=0;
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]=='1' )
                {
                    traverseIsland(i,j,grid);
                    numberOfIsland++;

                }
            }
        }
        return numberOfIsland;

    }

    private void traverseIsland(int i, int j, char[][] grid) {
        if (grid[i][j] == '0') return;

        grid[i][j] = '0';
        if (j - 1 >= 0) traverseIsland(i, j - 1, grid);
        if (i - 1 >= 0) traverseIsland(i - 1, j, grid);
        if (j + 1 < grid[0].length) traverseIsland(i, j + 1, grid);
        if (i + 1 < grid.length) traverseIsland(i + 1, j, grid);
    }
}