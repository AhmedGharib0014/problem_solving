class Solution {
    public void setZeroes(int[][] matrix) {
       boolean firstRow = false;
        boolean firstColumn = false;

        int rows = matrix.length;
        int columns = matrix[0].length;


        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstRow = true;
                break;
            }
        }

        for (int j = 0; j < columns; j++) {
            if (matrix[0][j] == 0) {
                firstColumn = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

        if (firstColumn) {
            for (int j = 0; j < columns; j++) {
                matrix[0][j] = 0;
            }
        }

    }
}