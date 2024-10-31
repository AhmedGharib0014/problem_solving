class Solution {
//     public int mySqrt(int x) {
//        int result = binarySearch(0, x, x);
//         if (result * result > x) {
//             return result - 1;
//         } else {
//             return result;
//         }

//     }

//     int binarySearch(int start, int end, int x) {
//         if (start >= end) {
//             return end;
//         }

//         int mid = (start + end) / 2;
//         double midsqr = (double) mid * mid ;

//         if (midsqr == x) {
//             return mid;
//         } else if (midsqr > x) {
//             return binarySearch(start, mid - 1, x);
//         } else {
//             return binarySearch(mid + 1, end, x);
//         }
//     }

    
    public int mySqrt(int x) {
        return binarySearch(x, 0, x);

    }

    private int binarySearch(int x, int start, int end) {
        if (start > end) return end;

        int mid = start + (end - start) / 2;

        long sr = (long) mid * mid;

        if (sr == x) return mid;
        else if (sr < x) return binarySearch(x, mid + 1, end);
        else return binarySearch(x, start, mid - 1);
    }
}