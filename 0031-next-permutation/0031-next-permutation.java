class Solution {
     public void nextPermutation(int[] nums) {
         if (nums.length < 2) return;

        int previousValue = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < previousValue) {
                int j = i + 1;
                while (j < nums.length && nums[i] >= nums[j]) j++;
                swap(nums, i, j);
                break;
            } else {
                previousValue = nums[i];
                int j = i;
                while (j + 1 < nums.length && nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    j++;
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int number) {
        int temp = nums[i];
        nums[i] = nums[number];
        nums[number] = temp;
    }


}