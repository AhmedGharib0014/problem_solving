class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

       int indexOfUniqueElement = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[indexOfUniqueElement]) {
                indexOfUniqueElement++;
                swap(nums, indexOfUniqueElement, i);
            }
        }


        return indexOfUniqueElement + 1;

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    
    
}