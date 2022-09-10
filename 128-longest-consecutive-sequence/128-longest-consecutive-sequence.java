class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length==1) return 1;
        int maxCount=0;

        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (Integer key : nums){
            if(!map.containsKey(key)) continue;
            int count =1;
            int i=1;
            while (map.containsKey(key+i)){
                count++;
                map.remove(key+i);
                i++;
            }
            i=1;
            while (map.containsKey(key-i)){
                count++;
                map.remove(key-i);
                i++;
            }

            if(maxCount<count) maxCount=count;
            if(maxCount>map.size()) return maxCount;
        }


        return maxCount;
    }
}