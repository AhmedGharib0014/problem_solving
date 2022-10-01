class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>  set = new HashSet<>();
        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(!set.contains(s.charAt(i))){
                count ++;
                set.add(s.charAt(i));
            }else {
                if(maxLength< count) maxLength= count;

                 int j=i-count;
                 while (j<i && s.charAt(j) != s.charAt(i)){
                     set.remove(s.charAt(j));
                     j++;
                     count--;
                 }

            }
        }
       if(maxLength< count) maxLength= count;

        return maxLength;
    }
}