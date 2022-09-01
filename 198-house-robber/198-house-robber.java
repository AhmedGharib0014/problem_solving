class Solution {
   


    public int rob(int[] nums) {
       if(nums.length==1) return nums[0];
       int max1=0;
       int max2= nums[0];
        
        for (int i=1;i<nums.length;i++){
            int temp = Math.max(nums[i]+max1,max2);
            max1=max2;
            max2=temp;
        }
        return max2;
    }
}