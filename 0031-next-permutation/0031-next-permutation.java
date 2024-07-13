class Solution {
    
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;
        int previousValue = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < previousValue) {
                swapTheValueWithTheFirstGreaterOne(nums, i);
                break;
            } else {
                previousValue = nums[i];
                moveTheValueToTheCorrectOrder(nums, i);
            }
        }
    }

    private void swapTheValueWithTheFirstGreaterOne(int[] nums, int i) {
        int j = i + 1;
        while (j < nums.length && nums[i] >= nums[j]) j++;
        swap(nums, i, j);
    }

    private void moveTheValueToTheCorrectOrder(int[] nums, int i) {
        int j = i;
        while (j + 1 < nums.length && nums[j] > nums[j + 1]) {
            swap(nums, j, j + 1);
            j++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}