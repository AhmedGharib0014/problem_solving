class Solution {
      public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        traverse(matrix, 0, matrix[0].length - 1, 0, matrix.length - 1, result);
        return result;
    }


    public void traverse(int[][] metrix, int left, int right, int top, int bottom, List<Integer> result) {
        if (left > right || top > bottom) return;

        for (int i = left; i <= right; i++) {
            result.add(metrix[top][i]);
        }
        top++;

        for (int i = top; i <= bottom; i++) {
            result.add(metrix[i][right]);
        }
        right--;

        if (left > right || top > bottom) return;

        for (int i = right; i >= left; i--) {
            result.add(metrix[bottom][i]);
        }
        bottom--;

        for (int i = bottom; i >= top; i--) {
            result.add(metrix[i][left]);
        }
        left++;

        traverse(metrix, left, right, top, bottom, result);
    }





}