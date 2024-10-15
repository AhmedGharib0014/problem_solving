class Solution {
     public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        binarySearch(nums, 0, nums.length - 1, target, result);
        return result;
    }

    private void binarySearch(int[] num, int start, int end, int target, int[] result) {
        if (start > end) return;


        int mid = start + (end - start) / 2;

        if (num[mid] == target) {
            if (result[0] == -1 && result[1] == -1) {
                result[0] = mid;
                result[1] = mid;
            } else {
                result[1] = Math.max(mid, result[1]);
                result[0] = Math.min(mid, result[0]);
            }
            binarySearch(num, start, mid - 1, target, result);
            binarySearch(num, mid + 1, end, target, result);
        } else if (target > num[mid]) {
            binarySearch(num, mid + 1, end, target, result);
        } else {
            binarySearch(num, start, mid - 1, target, result);
        }
    }
}