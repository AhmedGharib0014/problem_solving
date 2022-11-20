class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet();
        int comparisonValue = Math.min(nums.length, k);

        for (int i = 0; i < comparisonValue; i++) {
            set.add(nums[i]);
        }
        
        if(set.size() < comparisonValue) return true;

        for (int i = 0; i < nums.length-k; i++) {
            set.add(nums[i+k]);
            set.remove(nums[i]);
            if(set.size() < comparisonValue) return true;
        }
        
        return false;
    }
}