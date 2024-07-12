class Solution {
      public int maximumGain(String s, int x, int y) {

        int result = 0;
        
        StringBuilder stringBuilder = new StringBuilder(s);
        if (x > y) {
            result += calculateForX(stringBuilder, x);
            StringBuilder stringBuilder2 = new StringBuilder();
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) != '*') stringBuilder2.append(stringBuilder.charAt(i));
            }
            result += calculateForY(stringBuilder2, y);


        } else {
            result += calculateForY(stringBuilder, y);
            StringBuilder stringBuilder2 = new StringBuilder();
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) != '*') stringBuilder2.append(stringBuilder.charAt(i));
            }
            result += calculateForX(stringBuilder2, x);

        }

        return result;


    }

    private int calculateForX(StringBuilder stringBuilder, int x) {
        int result = 0;
        String s = stringBuilder.toString();
        Stack<Integer> aStach = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') aStach.push(i);
            else if (s.charAt(i) == 'b') {
                if (!aStach.isEmpty()) {
                    stringBuilder.setCharAt(aStach.pop(), '*');
                    stringBuilder.setCharAt(i, '*');
                    result += x;
                }

            } else {
                aStach.clear();
            }

        }

        return result;
    }


    private int calculateForY(StringBuilder stringBuilder, int y) {
        int result = 0;
        String s = stringBuilder.toString();
        Stack<Integer> bStach = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') bStach.push(i);
            else if (s.charAt(i) == 'a') {
                if (!bStach.isEmpty()) {
                    stringBuilder.setCharAt(bStach.pop(), '*');
                    stringBuilder.setCharAt(i, '*');
                    result += y;
                }

            } else {
                bStach.clear();
            }

        }

        return result;
    }

}