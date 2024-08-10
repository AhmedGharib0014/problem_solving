class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        if (strs.length == 0) return result;
        if (strs.length == 1) return strs[0];

        result = strs[0];


        for (int i = 1; i < strs.length; i++) {
            int maxCommonIndex = 0;

            int minLength = Math.min(result.length(), strs[i].length());

            while (maxCommonIndex < minLength && strs[i].charAt(maxCommonIndex) == result.charAt(maxCommonIndex)) {
                maxCommonIndex++;
            }

            result = result.substring(0, maxCommonIndex);
        }

        return result;
    }
}