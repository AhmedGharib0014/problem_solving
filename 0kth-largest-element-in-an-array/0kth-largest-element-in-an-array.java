class Solution {
    
     public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums,0,nums.length-1,nums.length-k);
    } 
    
    public  int quickSelect(int[] nums , int start , int end , int index){
        int pivot = nums[end];
        int pointer = start;

        for (int i = start; i < end; i++) {

            if(nums[i] <= pivot){

                swap(nums, i, pointer);

                pointer++;
            }

        }

       swap(nums,pointer, end);

        if(pointer > index) return quickSelect(nums,start,pointer-1,index);
        else if (pointer < index) return quickSelect(nums,pointer+1,end,index);
        else return pivot;
    }


    public void swap(int [] nums ,int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}