class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> values = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        String[] arr = s.split(" ");
        
        if (pattern.length() != arr.length) return false;
        
        int index = 0;
        for (Character a : pattern.toCharArray()) {
            if (!map.containsKey(a)) {
                if (values.contains(arr[index])) {
                    return false;
                }
                
                values.add(arr[index]);
                map.put(a, arr[index]);
              
            }
            builder.append(map.get(a));
            builder.append(" ");
            index++;
        }
        
        return builder.toString().trim().equals(s);
    }

}