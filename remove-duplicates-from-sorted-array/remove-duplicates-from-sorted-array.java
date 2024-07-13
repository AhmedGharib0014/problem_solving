class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int i = 0;
        int j = i + 1;

        while (j < nums.length) {
            if (nums[j] > nums[i]) {
                while (j + 1 < nums.length && nums[j] == nums[j + 1]) j++;
                i++;
                swap(nums, j, i);
            }
            j++;
        }

        return i + 1;

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
    
}