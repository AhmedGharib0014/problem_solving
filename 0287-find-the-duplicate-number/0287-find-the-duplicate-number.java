class Solution {
    public int findDuplicate(int[] nums) {
        int index=0;
        for (int i : nums){
            nums[i% nums.length] += nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>nums[index])index= i;
        }

        return  index;
    }
}