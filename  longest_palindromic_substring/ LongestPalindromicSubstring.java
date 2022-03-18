
class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        String longestString = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            int leftIndex = -1;
            int rightIndex = -1;

            if (i > 0 && i + 1 < s.length() && s.charAt(i - 1) == s.charAt(i + 1)) {
                rightIndex = i + 1;
                leftIndex = i - 1;
                do {
                    if (leftIndex != -1 && leftIndex >= 0 && rightIndex < s.length()
                            && s.substring(leftIndex, rightIndex + 1).length() > longestString.length()) {
                        longestString = s.substring(leftIndex, rightIndex + 1);
                    }
                    leftIndex -= 1;
                    rightIndex += 1;

                } while (leftIndex != -1 && leftIndex >= 0 && rightIndex < s.length()
                        && s.charAt(leftIndex) == s.charAt(rightIndex));

            }
            if (i >= 0 && i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                rightIndex = i + 1;
                leftIndex = i;
                do {
                    if (leftIndex != -1 && leftIndex >= 0 && rightIndex < s.length()
                            && s.substring(leftIndex, rightIndex + 1).length() > longestString.length()) {
                        longestString = s.substring(leftIndex, rightIndex + 1);
                    }
                    leftIndex -= 1;
                    rightIndex += 1;

                } while (leftIndex != -1 && leftIndex >= 0 && rightIndex < s.length()
                        && s.charAt(leftIndex) == s.charAt(rightIndex));

            }

        }
        return longestString;

    }

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }

}
