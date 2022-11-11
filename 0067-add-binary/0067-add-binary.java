class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int length = Math.max(a.length(), b.length());
        int carry = 0;

        for (int i = 0; i < length; i++) {
            char opA = '0';
            char opB = '0';

            if (a.length() - 1 - i >= 0) {
                opA = a.charAt(a.length() - 1 - i);
            }

            if (b.length() - 1 - i >= 0) {
                opB = b.charAt(b.length() - 1 - i);
            }

            int sum = (opA - '0') + (opB - '0') + carry;

            if (sum == 1 || sum == 3) {
                result.append('1');
            } else {
                result.append('0');
            }

            carry = sum > 1 ? 1 : 0;

        }

        if (carry > 0) {
            result.append('1');
        }

        return result.reverse().toString();
    }
}