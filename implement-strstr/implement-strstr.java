class Solution {
    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0) && isNeedle(haystack, needle, i)) {
                return i;

            }

        }

        return -1;

    }

    public boolean isNeedle(String haystack, String needle, int startingIndex) {

        for (int i = 0; i < needle.length(); i++) {
            if (!(startingIndex + i < haystack.length() && needle.charAt(i) == haystack.charAt(startingIndex + i)))
                return false;

        }
        return true;
    }
}