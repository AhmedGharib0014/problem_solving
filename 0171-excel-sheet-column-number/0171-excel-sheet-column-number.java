class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int i = columnTitle.length() - 1;

        for (Character c : columnTitle.toCharArray()) {
            result += (c-64) * Math.pow(26, i);
            i--;
        }

        return result;

    }
}