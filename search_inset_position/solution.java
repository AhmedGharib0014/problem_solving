public class solution {
    public int searchInsert(int[] nums, int target) {
        return  binarySearch(nums,target,0,nums.length);

    }

    public int binarySearch(int[] nums, int target,int start,int end  ){
        if(start >= end) return  start;
        int mid = start +(end - start)/2;
        if(nums[mid]== target) return  mid;
        else if (nums[mid] < target) 
          return   binarySearch(nums,target,mid+1,end);
        
        else return   binarySearch(nums,target,start,mid);
        

    }
    
}
