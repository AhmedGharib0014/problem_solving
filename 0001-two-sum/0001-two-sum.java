import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (complementIndexMap.containsKey(nums[i])) {
                return new int[]{complementIndexMap.get(nums[i]), i};
            }

            complementIndexMap.put(complement, i);
        }

        return new int[0];
    }
}
