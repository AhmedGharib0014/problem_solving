class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) &&( dfs(i, j, 0, word, board) || word.length() ==1)) {
                    return true;
                }
            }
        }

        return false;
    }

     public boolean dfs(int i, int j, int index, String word, char[][] board) {
        if (index == word.length()) return true;
        
        if (i < 0 || i >= board.length || j >= board[0].length || j < 0 || board[i][j] == '*' ||
                (index < word.length() && board[i][j] != word.charAt(index))) {
            return false;

        }

        char temp = board[i][j];
        board[i][j] = '*';

        boolean res = dfs(i - 1, j, index + 1, word, board)
                || dfs(i + 1, j, index + 1, word, board)
                || dfs(i, j - 1, index + 1, word, board)
                || dfs(i, j + 1, index + 1, word, board);
        
        board[i][j] = temp;

        return res;

    }






}