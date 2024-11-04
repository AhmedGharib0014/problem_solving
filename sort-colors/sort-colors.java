class Solution {
       public void sortColors(int[] nums) {
        if (nums.length < 2) return;
        int redIndex = -1;
        int blueIndex = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                redIndex++;
                swap(nums, redIndex, i);

            } 
            else if (nums[i] == 2 && i < blueIndex) {
                blueIndex--;
                swap(nums, i, blueIndex);
                i--;
            }

        }
           
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}