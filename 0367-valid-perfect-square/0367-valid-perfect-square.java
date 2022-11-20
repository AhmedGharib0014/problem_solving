class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1) return true;
        return checkPerfectSquare(0, num, num);

    }

    public boolean checkPerfectSquare(int start, int end, int num) {
        if (start >= end) {
            return false;
        }

        int mid = (end + start) / 2;

        if (mid * mid == num) {
            return true;
        } else if (num/mid < mid) {
            return checkPerfectSquare(start, mid, num);
        } else {
            return checkPerfectSquare(mid + 1, end, num);
        }


    }

}