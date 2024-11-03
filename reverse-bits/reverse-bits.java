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
        result >>= 0;

        return result;
    }

    public int swap(int n, int i) {
        int x = getBitOfI(n, (31 - i));
        int y = getBitOfI(n, i);

        n = manipulateBitOfX(n, i, x);
        n = manipulateBitOfX(n, (31 - i), y);

        return n;
    }

    private static int manipulateBitOfX(int n, int i, int x) {
        if (x != 0) {
            n = n | (1 << i);
        } else {
            n = n & (~(1 << i));
        }
        return n;
    }

    private static int getBitOfI(int n, int i) {
        int x = 1 << i;
        return (n & x);
    }


   

}