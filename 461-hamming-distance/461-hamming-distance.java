class Solution {
    public int hammingWeight(int n) {
        int count=0;

        for (int i = 0; i < 32; i++) {
            if((n & (1<<i))!= 0){
                count ++;
            }
        }

        return count;

    }


    public int hammingDistance(int x, int y) {
        int n = ~(x ^ y);
        return 32- hammingWeight(n);
    }
}