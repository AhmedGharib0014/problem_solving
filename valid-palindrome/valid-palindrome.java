class Solution {
    
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (j >= i) {
            while (!isAlpha(s.charAt(i))) {
                i++;
                if (i > j) break;
            }

            while (!isAlpha(s.charAt(j))) {
                j--;
                if (i > j) break;
            }
            if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            else {
                i++;
                j--;
            }

        }

        return true;

    }

    public boolean isAlpha(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
}