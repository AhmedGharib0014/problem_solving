class Solution {
    public boolean isIsomorphic(String s, String t) {
          HashMap<Character, Character> sMap = new HashMap<>();
        Set<Character> valuesSet = new HashSet<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (!sMap.containsKey(c)) {
                if (valuesSet.contains(t.charAt(i))) {
                    return false;
                }
                sMap.put(c, t.charAt(i));
                valuesSet.add(t.charAt(i));
            }

            builder.append(sMap.get(c));
        }

        return builder.toString().equals(t);
    }
}