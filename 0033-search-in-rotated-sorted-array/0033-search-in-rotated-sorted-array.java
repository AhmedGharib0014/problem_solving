class Solution {
    
   public int search(int[] nums, int target) {

        int end = nums.length-1;

        int rotationKey = findRotationKey(nums, 0, end);

        int index = binarySearch(nums, 0, rotationKey, target);

        if(index== -1 ){
            index=binarySearch(nums, rotationKey+1, end, target);
        }

        return index;

    }

    public int findRotationKey(int[] nums,int start , int end){

        if(start> end) return end;

        int mid= (start + end)/ 2;

        if(nums[mid] >= nums[0]) {
            return findRotationKey(nums, mid + 1, end);
        } else{
            return findRotationKey(nums, start, mid - 1);
        }
        
    }

    public int binarySearch(int[] nums , int start , int end , int target){
        if (start > end) return -1;

        int mid= (start+end)/2;

        if(nums[mid] == target){
            return mid;
        } else if( nums[mid] > target ){
            return binarySearch(nums, start, mid-1, target);
        } else{
            return binarySearch(nums, mid + 1, end, target);
        }

    }

}