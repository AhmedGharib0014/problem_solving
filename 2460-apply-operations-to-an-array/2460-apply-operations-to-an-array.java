class Solution {
   public int[] applyOperations(int[] nums) {
        int zerosIndex = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {                    
                swap(nums,zerosIndex+1,i);
                zerosIndex ++;
            }
             
        }

        return nums;

    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}