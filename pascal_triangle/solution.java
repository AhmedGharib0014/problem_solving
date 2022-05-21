public class solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0|| j==i) {
                    row.add(1);
                    continue;
                }else{
                    ArrayList<Integer> prevRow= (ArrayList<Integer>) triangle.get(i-1);
                    row.add(prevRow.get(j) +prevRow.get(j-1));
                }
            }
            triangle.add(row);
        }
        return  triangle;
    }
    
}
