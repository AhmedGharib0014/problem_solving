package longest_substring_without_repeating_characters;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1)
            return 0;

        int i = 0;
        int j = 1;
        int maxsub = 1;
        int tempSub = 1;
        while (j < s.length()) {
            if (!s.substring(i, j).contains(s.substring(j, j + 1))) {
                tempSub++;
                j++;
            } else {
                if (tempSub > maxsub) {
                    maxsub = tempSub;
                }
                i++;
                tempSub = j - i;

            }
        }
        if (tempSub > maxsub)
            maxsub = tempSub;

        return maxsub;

    }

    public static void main(String[] args) {
        String input = "au";
        System.out.println(lengthOfLongestSubstring(input));

    }

}
