class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int val1 = nums.length/2;
        
        for (Integer i : nums){
            int val = map.getOrDefault(i,0)+1;
            if (val > val1) return i;
            else map.put(i,val);
        }
        
        return 0;
    }
}