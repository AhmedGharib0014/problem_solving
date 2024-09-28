class Solution {
     public int numIslands(char[][] grid) {
       int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    travers(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    void travers(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'|| grid[i][j] == '*') return;
        grid[i][j] = '*';
        travers(grid, i - 1, j);
        travers(grid, i + 1, j);
        travers(grid, i, j - 1);
        travers(grid, i, j + 1);
    }
}