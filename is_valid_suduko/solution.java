public class solution {
    public boolean isValidSudoku(char[][] board) {
        // validate rows
        for(int i=0;i< board.length;i++){
            char[] row = board[i];
            HashSet<Character> charsSet = new HashSet<>();
            for(int j=0;j<row.length;j++){
                if(row[j] != '.'){
                    if(charsSet.contains(row[j])||row[j]<'1'|| row[j]>'9')
                        return false;

                    else {
                        charsSet.add(row[j]);
                    }
                }
            }
        }

        // validate columns
        for(int i=0;i< board[0].length;i++) {
            HashSet<Character> charsSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.') {
                    if (charsSet.contains(board[j][i]) || board[j][i] < '1' || board[j][i] > '9') return false;
                    else {
                        charsSet.add(board[j][i]);
                    }
                }

            }
        }
        
        // validate Each of the nine 3*3
        int[][] starts={{0,0},{3,0},{6,0},{0,3},{3,3},{6,3},{0,6},{3,6},{6,6}};
        for(int[] start : starts){
            HashSet<Character> charsSet = new HashSet<>();
            for(int x = start[0];x < start[0]+3;x++){
                for(int y=start[1]; y<start[1]+3;y++) {
                    if (board[x][y] != '.') {
                        if (charsSet.contains(board[x][y]) || board[x][y] < '1' || board[x][y] > '9')
                            return false;
                        else {
                            charsSet.add(board[x][y]);
                        }
                    }
                }
            }
        }
        return  true;
    }


    
}
