class Solution {
     public int uniquePaths(int m, int n) {
        int [][] pathArray = new int[m][n];

        for (int i = 0; i < m; i++) {
            pathArray[i][0]= 1;
        }
        for (int i = 0; i < n; i++) {
            pathArray[0][i]= 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                pathArray[i][j]= pathArray[i-1][j]+pathArray[i][j-1];
            }
        }

        return pathArray[m-1][n-1];
    }

}