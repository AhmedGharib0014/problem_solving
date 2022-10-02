class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowsIndex=new HashSet<Integer>();
        HashSet<Integer> columnIndex=new HashSet<Integer>();
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowsIndex.add(i);
                    columnIndex.add(j);
                }
            }
        }
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rowsIndex.contains(i)|| columnIndex.contains(j)){
                    matrix[i][j]=0;
                }
               
            }
        }
    }
}