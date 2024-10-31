class Solution {
//     public int trailingZeroes(int n) {
//         int zeros = 0;
//        int x = 5;

//        while (n >= x){
//            zeros += n / x;
//            x *= 5;
//        }

//        return zeros;
//     }
    
     public int trailingZeroes(int n) {

       int numberOfTrialingZeros = 0;

        for (int i = 5; i <= n; i = i * 5) {
            numberOfTrialingZeros += n / i;

        }

        return numberOfTrialingZeros ;
    }
}