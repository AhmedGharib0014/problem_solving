class Solution {
      public int myAtoi(String s) {
           
           long result = 0;
        boolean isPositive = true;
        s = s.trim();
        int index = 0;

        if (s.isEmpty()) return 0;

        if (s.charAt(0) == '-') {
            isPositive = false;
            index++;
        } else if (s.charAt(0) == '+') {
            index++;
        }

        while (index < s.length() && s.charAt(index) == '0' && Character.isDigit(s.charAt(index))) {
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            result *= 10;
            result += digit;
            if (isPositive && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }

        if (isPositive) {
            return result < Integer.MAX_VALUE ? (int) result : Integer.MAX_VALUE;
        } else {
            return -1 * result < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) (-1 * result);
        }



    }



   
}