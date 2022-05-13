public class solution {

    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            for(int j=i;j<matrix.length-i-1;j++){
                int[] start = {i,j};
                int[] next =start;
                int carry=matrix[start[0]][start[1]];
               do{
                   next= calculateNextIndex(next,matrix.length);
                   System.out.print(next[0]);
                   System.out.print(" ");
                   System.out.print(next[1]);
                   System.out.println();
                   int temp = matrix[next[0]][next[1]];
                   matrix[next[0]][next[1]]= carry;
                   carry=temp;
               }while (!((next[0] == start[0]) && (next[1] == start[1])));



            }
        }
    }

    public int[] calculateNextIndex(int[] start,int n){
        int[] next= {start[1],n-1-start[0]};
        return next;
    }




    
}
