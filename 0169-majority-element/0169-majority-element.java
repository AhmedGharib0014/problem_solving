class Solution {
    public int majorityElement(int[] nums) {
          HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer i : nums){
            int val = map.getOrDefault(i,0)+1;
            if (val > (nums.length/2)) return i;
            else map.put(i,val);
        }
        
        return 0;
    }
}