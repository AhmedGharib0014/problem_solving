class Solution {
     public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0]=-1;
        result[1]=-1;
        rangeBinarySearch(nums, 0, nums.length - 1, target, result);
        return result;
    }


    public  void rangeBinarySearch(int[] nums , int s , int e,int target , int[] result){
        if(s>e) return ;

        int mid=(s+e)/2;

        if (nums[mid] > target) {
            rangeBinarySearch(nums,s,mid-1,target,result);
        }else if(nums[mid] < target){
            rangeBinarySearch(nums,mid+1,e,target,result);
        }else {
            if(result[0] == -1 && result[1] == -1){
                result[0]=mid;
                result[1]= mid;
            }else {
                result[1]= Math.max(mid,result[1]);
                result[0]= Math.min(mid,result[0]);
            }
            rangeBinarySearch(nums,s,mid-1,target,result);
            rangeBinarySearch(nums,mid+1,e,target,result);
        }
    }
}