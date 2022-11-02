class Solution {
    public int titleToNumber(String columnTitle) {
         int result = 0;
        Map<Character, Integer> charMap = Map.ofEntries(
            Map.entry('A', 1),
            Map.entry('B', 2),
            Map.entry('C', 3),
            Map.entry('D', 4),
            Map.entry('E', 5),
            Map.entry('F', 6),
            Map.entry('G', 7),
            Map.entry('H', 8),
            Map.entry('I', 9),
            Map.entry('J', 10),
            Map.entry('K', 11),
            Map.entry('L', 12),
            Map.entry('M', 13),
            Map.entry('N', 14),
            Map.entry('O', 15),
            Map.entry('P', 16),
            Map.entry('Q', 17),
            Map.entry('R', 18),
            Map.entry('S', 19),
            Map.entry('T', 20),
            Map.entry('U', 21),
            Map.entry('V', 22),
            Map.entry('W', 23),
            Map.entry('X', 24),
            Map.entry('Y', 25),
            Map.entry('Z', 26)
        );


       int i = columnTitle.length() - 1;

        for (Character c : columnTitle.toCharArray()) {
            result += charMap.get(c) * Math.pow(26, i);
            i--;
        }


        return result;

    }
}