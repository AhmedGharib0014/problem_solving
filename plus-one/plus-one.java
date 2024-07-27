class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int index = digits.length - 1;

        do {
            int sum = digits[index] + carry + (index == digits.length - 1 ?1:0);
            digits[index] = sum % 10;
            carry = sum > 9 ? 1 : 0;
            index --;

        } while (carry > 0 && index >= 0);


        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;

        } else {
            return digits;
        }


    }

}