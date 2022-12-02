class Solution {
    public int longestPalindrome(String s) {
        int palLength = 0;
        boolean containEvenValue = false;
        HashMap<Character, Integer> charFrequencies = new HashMap<>();

        for (Character ch : s.toCharArray()) {
            charFrequencies.put(ch, charFrequencies.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
              if (entry.getValue() > 1) {
                if (entry.getValue() % 2 == 0) {
                    palLength += entry.getValue();
                } else {
                    containEvenValue = true;
                    palLength += entry.getValue() - 1;
                }
            } else {
                containEvenValue = true;
            }
        }

        if (containEvenValue) {
            palLength++;
        }

        return palLength;
    }
}