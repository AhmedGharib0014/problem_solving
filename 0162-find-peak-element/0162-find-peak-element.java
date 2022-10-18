class Solution {
     public int findPeakElement(int[] nums) {
         
        if(nums.length == 1) return 0;
         
        return checkPeekElement(nums,0,nums.length );

    }

    public int checkPeekElement(int[] nums,int start, int end){
        
        if(start>end) return -1;

        int mid = (start+end)/2;

        if(mid == 0 && nums[mid] > nums[mid+1]) return mid;

        if(mid == nums.length-1 && nums[mid] > nums[mid-1]) return mid;

        if(mid != 0 &&  mid != nums.length-1 && nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;

        int left = checkPeekElement(nums,start,mid-1);
        if( left != -1) return left;
        
        else return checkPeekElement(nums,mid+1,end);

    }
}