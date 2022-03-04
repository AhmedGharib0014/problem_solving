import java.util.HashSet;

class MatrixZeros {

    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> columns = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows.contains(i)) {
                    matrix[i][j] = 0;
                    continue;
                }
                if (columns.contains(j)) {
                    matrix[i][j] = 0;
                    continue;
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) { // this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) { // this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // change line on console as row comes to end in the matrix.
        }

    }

    public static void main(String[] args) {
        final int[][] matrix = {
                { 1, 1, 1 },
                { 4, 0, 6 },
                { 7, 8, 9 }
        };

        setZeroes(matrix);

    }
}