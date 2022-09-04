import java.math.BigInteger;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
         BigInteger bigInteger =new BigInteger(Integer.toString(n));
        
        for (int i = 0; i < 16; i++) {
            int first = n & (1<<i);
            int second = n &(1<<(31-i));

            bigInteger=second == 0? bigInteger.clearBit(i):bigInteger.setBit(i);
            bigInteger=first == 0? bigInteger.clearBit(31-i):bigInteger.setBit(31-i);
        }

        return bigInteger.intValue();
    }
}