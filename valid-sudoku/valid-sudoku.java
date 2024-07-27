class Solution {
      public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (!validateRow(board[i])) return false;
        }

        for (int i = 0; i < board[0].length; i++) {
            if (!validateColumn(board, i)) return false;


        }

       for (int column = 0; column < 9; column = column + 3) {
            for (int row = 0; row < 9; row = row + 3) {
                if (!validateSubBox(board, row, column)) {
                    return false;
                }
            }
        }

        return true;

    }

    public boolean validateRow(char[] row) {
        Set<Integer> set = new HashSet<>();

        for (char n : row) {

            int numericValue = Character.getNumericValue(n);
            if (isValidNumber(numericValue) && !set.add(numericValue)) return false;

        }

        return true;
    }

    public boolean validateColumn(char[][] board, int columnIndex) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < board[0].length; i++) {

            int numericValue = Character.getNumericValue(board[i][columnIndex]);
            if (isValidNumber(numericValue) && !set.add(numericValue)) return false;

        }

        return true;
    }

     public boolean validateSubBox(char[][] board, int startRowIndex, int startColumnIndex) {
        Set<Integer> set = new HashSet<>();

        for (int i = startRowIndex; i < startRowIndex + 3; i++) {

            for (int j = startColumnIndex; j < startColumnIndex + 3; j++) {
                int numericValue = Character.getNumericValue(board[i][j]);
                if (isValidNumber(numericValue) && !set.add(numericValue)) return false;
            }
        }

        return true;
    }



    boolean isValidNumber(int i) {
        return i > 0 && i <= 9;
    }

}