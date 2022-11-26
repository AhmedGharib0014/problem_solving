class Solution {
     public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {

            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            
            for (int j = 1; j < i ; j++) {
                    List<Integer> previous = triangle.get(i - 1);
                    temp.add(previous.get(j - 1) + previous.get(j));
            }
            
            if (i > 0) temp.add(1);
            triangle.add(temp);
        }

        return triangle.get(triangle.size() - 1);

    }
}