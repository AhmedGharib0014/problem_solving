class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        
       HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        return freq.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .limit(k).mapToInt(Map.Entry::getKey)
            .toArray();
    }
}