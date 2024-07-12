class Solution {
     public int maximumGain(String s, int x, int y) {
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        
        if (x > y) {
            result += calculateMaxGain(stringBuilder, 'a', 'b', x);
            stringBuilder = removeAstrix(stringBuilder);
            result += calculateMaxGain(stringBuilder, 'b', 'a', y);

        } else {
            result += calculateMaxGain(stringBuilder, 'b', 'a', y);
            stringBuilder = removeAstrix(stringBuilder);
            result += calculateMaxGain(stringBuilder, 'a', 'b', x);

        }

        return result;


    }

    private static StringBuilder removeAstrix(StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '*') stringBuilder2.append(stringBuilder.charAt(i));
        }
        return stringBuilder2;
    }

    private int calculateMaxGain(StringBuilder stringBuilder, Character first, Character second, int y) {
        int result = 0;
        Stack<Integer> firstCharStack = new Stack<>();

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == first) firstCharStack.push(i);
            else if (stringBuilder.charAt(i) == second) {
                if (!firstCharStack.isEmpty()) {
                    stringBuilder.setCharAt(firstCharStack.pop(), '*');
                    stringBuilder.setCharAt(i, '*');
                    result += y;
                }

            } else {
                firstCharStack.clear();
            }

        }

        return result;
    }


}