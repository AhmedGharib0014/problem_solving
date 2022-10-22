class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean rowsIsMin = false;
        if (matrix.length < matrix[0].length){
            rowsIsMin=true;
        }
        
        if(rowsIsMin){
            for (int [] nums: matrix){
                int targetIndex = rowBinarySearch(nums,0,matrix[0].length-1,target);
                if(targetIndex != -1) return true;
            }
        }else {
            for (int i = 0; i < matrix[0].length; i++) {
                int targetIndex = columnBinarySearch(matrix,i,0,matrix.length-1,target);
                if(targetIndex != -1) return true;
            }
        }
        
        return false;

    }

    public int rowBinarySearch(int[] nums , int start , int end , int target){
        if (start > end) return -1;

        int mid= (start+end)/2;

        if(nums[mid] == target){
            return mid;
        } else if( nums[mid] > target ){
            return rowBinarySearch(nums, start,mid-1, target);
        } else{
            return rowBinarySearch(nums,mid + 1, end, target);
        }

    }

    public int columnBinarySearch(int[][] nums ,int columnIndex, int start , int end , int target){
        if (start > end) return -1;

        int mid= (start+end)/2;

        if(nums[mid][columnIndex] == target){
            return mid;
        } else if( nums [mid][columnIndex]> target ){
            return columnBinarySearch(nums, columnIndex,start,mid-1, target);
        } else{
            return columnBinarySearch(nums,columnIndex,mid + 1, end, target);
        }

    }
}