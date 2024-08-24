import java.math.BigInteger;

public class Solution {
    // you need treat n as an unsigned value
      public int reverseBits(int n) {
        for (int i = 0; i < 16; i++) {
            n = doReverse(n, i);
        }
        return n;
    }

    public int doReverse(int n, int i) {
        int x = 1 << (31 - i);
        int xRestulr = n & x;

        int y = 1 << i;
        int yREsult = n & y;

        if (xRestulr != 0) {
            n = n | (1 << i);
        } else {
            n = n & (~(1 << i));
        }


        if (yREsult != 0) {
            n = n | (1 << (31 - i));
        } else {
            n = n & (~(1 << (31 - i)));

        }

        return n;
    }


}