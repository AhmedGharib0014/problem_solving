class Solution {
    public int addDigits(int num) {
         while (num >= 10) {
            int length = String.valueOf(num).length();
            int sum = 0;

            for (int i = length; i >= 0; i--) {
                int temp = (int) (num / Math.pow(10, i));
                num -= temp * Math.pow(10, i);
                sum += temp;
            }

            num = sum;
        }

        return num;
    }
}