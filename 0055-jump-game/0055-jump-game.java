class Solution {
    public boolean canJump(int[] nums) {

        return checkIfCanReached(nums,nums.length-1);

    }


    public boolean checkIfCanReached(int [] nums , int position){
        if(position == 0) return true;

        int index= position-1;

        while (index >= 0){
            if(nums[index] >= (position-index)){
                return checkIfCanReached(nums,index);
            }else {
                index--;
            }
        }


        return false;
     }

}