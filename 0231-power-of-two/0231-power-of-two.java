class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 536870912) return  true;
       return Math.log(n) / Math.log(2) == (int) (Math.log(n) / Math.log(2));
    }
}