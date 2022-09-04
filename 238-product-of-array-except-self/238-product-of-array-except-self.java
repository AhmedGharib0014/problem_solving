class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int production = 1;
        int zerosCount =0;


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zerosCount ++;
            }else{
                production *= nums[i];

            }
        }
        
        

        for (int i = 0; i < nums.length; i++) {
            if(zerosCount>1 || (zerosCount>0 && nums[i] != 0)){
                ans[i]=0;
            }else if(nums[i] == 0) {
                ans[i]= (production/1);
            }else {
                ans[i] = (production /nums[i]);
            }
        }
        return ans;
    }
}