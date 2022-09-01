class Solution {
   
    // recursion version exceeds time limits
    public  int calculateMoney(int[] nums,int currentIndex){
        
        if(currentIndex >= nums.length) return 0;
        
        return Math.max(calculateMoney(nums,currentIndex+2),
                        calculateMoney(nums,currentIndex+3))+nums[currentIndex];
    }


    public int robRecursion(int[] nums) {
        if(nums.length < 2) return nums[0];
        
        return Math.max(calculateMoney(nums,0),calculateMoney(nums,1));
    }

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