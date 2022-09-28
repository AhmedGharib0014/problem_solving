class Solution {
    public int longestIncreasingPath(int[][] matrix) {
    
        int [][] paths = new int[matrix.length][matrix[0].length];

        int longestPath = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                int pathLength= checkLongestPathOfNode(i,j,matrix,paths);
                longestPath = Math.max(longestPath,pathLength);
            }

        }

        return longestPath;

    }

    private int checkLongestPathOfNode(int i,int j, int[][] matrix1, int[][] paths) {
        if(i<0 || i >= matrix1.length || j<0 || j>matrix1[0].length) return 0;

        int value = matrix1[i][j];

        int left=0;
        int right=0;
        int top=0;
        int bottom=0;

        if(j-1>=0 && matrix1[i][j-1]>value){
            if(paths[i][j-1] >0) {
                left= paths[i][j-1];
            }else {
                left = checkLongestPathOfNode(i,j-1,matrix1,paths);
            }

        }

        if(j+1<matrix1[0].length && matrix1[i][j+1]>value){
            if(paths[i][j+1] >0) {
                right= paths[i][j+1];
            }else {
                right = checkLongestPathOfNode(i,j+1,matrix1,paths);
            }

        }

        if(i-1>=0 && matrix1[i-1][j]>value){
            if(paths[i-1][j] >0) {
                top= paths[i-1][j];
            }else {
                top = checkLongestPathOfNode(i-1,j,matrix1,paths);
            }

        }

        if(i+1<matrix1.length&& matrix1[i+1][j]>value){
            if(paths[i+1][j] >0) {
                bottom= paths[i+1][j];
            }else {
                bottom = checkLongestPathOfNode(i+1,j,matrix1,paths);
            }

        }

        int maxPath = Math.max(left,right);

        maxPath = Math.max(maxPath,top);

        maxPath = Math.max(maxPath,bottom);

        paths[i][j]= maxPath+1;

        return maxPath+1;

    }


}