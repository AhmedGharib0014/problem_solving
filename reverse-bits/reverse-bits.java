import java.math.BigInteger;

public class Solution {
     public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int firstBit = n & 1;
            int reversed = firstBit << (31 - i);
            result |= reversed;
            n >>= 1;
        }

        return result;
    }   
}