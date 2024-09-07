class Solution {
     public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        Map<Character, String> input = new HashMap<>();
        input.put('2', "abc");
        input.put('3', "def");
        input.put('4', "ghi");
        input.put('5', "jkl");
        input.put('6', "mno");
        input.put('7', "pqrs");
        input.put('8', "tuv");
        input.put('9', "wxyz");
        track(input, 0, digits, "", result);

        return result;

    }

    void track(Map<Character, String> input, int currentIndex, String digits, String currentString, List<String> result) {
        if (currentIndex == digits.length()) {
            result.add(currentString);
            return;
        }
        for (char ch : input.get(digits.charAt(currentIndex)).toCharArray()) {
            track(input, currentIndex + 1, digits, currentString + String.valueOf(ch), result);
        }

    }


}