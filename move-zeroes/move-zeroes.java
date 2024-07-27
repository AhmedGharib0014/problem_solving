class Solution {
   public void moveZeroes(int[] nums) {

        int nonZerosIntegersIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZerosIntegersIndex += 1;
                if (nonZerosIntegersIndex != i) {
                    swapIntegers(nums, nonZerosIntegersIndex, i);
                }
            }
        }

    }
    
     void swapIntegers(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}