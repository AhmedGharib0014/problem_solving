class Solution {
    public double myPow(double x, int n) {
         if (x == 0) return 0;
        double result = calculate(x, n);

        return n >= 0 ? result : 1 / result;

    }

    public double calculate(double x, int n) {
        if (n == 0) return 1;

        double result = calculate(x, n / 2);
        result = result * result;

        return n % 2 == 0 ? result : result * x;
    }

    
    
}