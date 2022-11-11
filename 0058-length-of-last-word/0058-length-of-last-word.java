class Solution {
    public int lengthOfLastWord(String s) {
         s = s.trim();
        int indexOfSpace = s.lastIndexOf(" ");
        return s.length() - indexOfSpace - 1;

    }
}