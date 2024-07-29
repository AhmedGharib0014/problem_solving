class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charFreq = new HashMap<>();

        for (Character c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }


        for (Character c : t.toCharArray()) {
            if (charFreq.containsKey(c)) {
                int value = charFreq.get(c);
                value--;
                if (value < 1) {
                    charFreq.remove(c);
                } else {
                    charFreq.put(c, value);
                }
            } else {
                return false;
            }

        }

        return charFreq.isEmpty();
    }
}