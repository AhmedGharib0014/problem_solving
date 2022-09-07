class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int c : nums3){
            for (int d : nums4){
                map.put(c+d, map.getOrDefault(c+d,0)+1);
            }
        }


        for (int a: nums1){
            for (int b : nums2){
                if(map.containsKey(0-(a+b))) count += map.get(0-(a+b));
            }
        }

        return count;
    }
}