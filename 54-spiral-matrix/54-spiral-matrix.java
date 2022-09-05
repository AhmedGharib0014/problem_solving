class Solution {
    enum Direction {right, down,left,up}

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        Direction direction = Direction.right;
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;


        while (result.size() < matrix[0].length * matrix.length) {
            switch (direction) {
                case right -> {
                    for (int i = left; i <= right; i++) {
                        result.add(matrix[top][i]);

                    }
                    direction = Direction.down;
                    top++;

                }
                case down -> {
                    for (int i = top; i <= bottom; i++) {
                        result.add(matrix[i][right]);
                    }
                    direction = Direction.left;
                    right--;

                }
                case left -> {
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    direction = Direction.up;
                    bottom--;
                }
                case up -> {
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    direction = Direction.right;
                    left++;
                }
            }

        }
        return result;
    }





}