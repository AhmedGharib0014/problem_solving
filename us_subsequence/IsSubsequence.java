package us_subsequence;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {

        int i = 0;

        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                if (i == s.length())
                    return true;

            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

}
