class Solution {
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)&& traverse(i,j,board,0,word)) return true;
            }
        }

        return false;
    }


    public boolean traverse(int i, int j,char[][] board,int charIndex, String word){
         if(i<0 || j<0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(charIndex)) return false;
         else if(charIndex==word.length()-1 && board[i][j]==word.charAt(charIndex)) return true;

         char ch = board[i][j];
         board[i][j]='*';
        boolean result = traverse(i-1,j,board,charIndex+1,word)
            ||  traverse(i+1,j,board,charIndex+1,word)
            ||  traverse(i,j+1,board,charIndex+1,word)
            || traverse(i,j-1,board,charIndex+1,word);
        board[i][j]=ch;
        return result;
    }






}