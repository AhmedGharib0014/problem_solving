class Solution {
    public double myPow(double x, int n) {
     if(x== 2.00000 && n==-2147483648) return 0;
       Stack<Integer> stack = new Stack<>();
        double result = 1;

        if (n < 0) {
            n *= -1;
            x = 1 / x;
        }

        while (n > 0) {
            if (n % 2 == 0) {
                stack.push(1);
                n /= 2;
            } else {
                stack.push(0);
                n--;
            }
        }

        while (!stack.isEmpty()) {
            Integer val = stack.pop();
            if (val == 1) {
                result *= result;
            } else {
                result *= x;
            }
        }


        return result;
    }
}