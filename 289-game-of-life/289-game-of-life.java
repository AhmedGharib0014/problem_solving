class Solution {
     public void gameOfLife(int[][] board) {
        int [][]  newCell =new  int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                newCell[i][j]= calculateState(board,i,j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=newCell[i][j];
            }
        }

    }

    public  int  calculateState(int [][] board,int currentRow,int currentColumn){
        int startsRow = Math.max(currentRow-1,0);
        int endRow=Math.min(currentRow+1,board.length-1);

        int startColumn= Math.max(currentColumn-1,0);
        int endColumn = Math.min(currentColumn+1,board[0].length-1);
        int sum=0;

        for (int k = startsRow; k <= endRow ; k++) {
            for (int l = startColumn; l <= endColumn; l++) {
                if( k==currentRow && l==currentColumn ) continue;
                else sum =sum+ board[k][l];
            }

        }

        if( board[currentRow][currentColumn] ==1 &&(sum ==2 || sum==3)) return 1;
        else if(board[currentRow][currentColumn] == 0 && sum==3)return 1;
        else  return 0;
    }

}