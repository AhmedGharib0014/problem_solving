class Solution {
   


    public int rob(int[] nums) {
       if(nums.length==1) return nums[0];
       int max1=nums[0];
       int max2= Math.max(nums[0],nums[1]);

       if(nums.length == 2) return max2;
        
      
        for (int i=2;i<nums.length;i++){
            int temp = Math.max(nums[i]+max1,max2);
            max1=max2;
            max2=temp;
        }
        return max2;
    }
}