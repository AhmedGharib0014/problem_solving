class Solution {
    public int addDigits(int num) {
         while (num >= 10) {
            int length = String.valueOf(num).length();
            int sum = 0;

             for (int i = length; i >= 0; i--) {
                int divisor = (int) Math.pow(10, i);
                int temp = num /divisor;
                num -= temp *divisor;
                sum += temp;
            }

            num = sum;
        }

        return num;
    }
}