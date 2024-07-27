class Solution {
    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                swap(matrix, i, j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                swap2(matrix, i, j);
            }
        }
    }

    public void swap2(int[][] matrix, int i, int j) {
        int length = matrix[0].length - 1;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][length - j];
        matrix[i][length - j] = temp;
    }

    public void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}