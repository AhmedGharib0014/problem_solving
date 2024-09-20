class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;

        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return result;
    
    }
}