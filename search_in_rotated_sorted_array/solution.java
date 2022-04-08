class Solution {
    public int search(int[] nums, int target) {
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]) k=i+1;
        }
        return binarySearch(nums,k,(nums.length+k) ,target);
    }

    public int binarySearch(int[] nums,int start , int end, int target){
        if(end<start){
            return -1;
        }
        int middle = start +(end-start)/2;
        if(nums[middle%nums.length]==target) return  middle%nums.length;
        else if(nums[middle%nums.length]<target) return binarySearch(nums,middle+1,end,target);
        else  return   binarySearch(nums,start,middle-1,target);
    }

}