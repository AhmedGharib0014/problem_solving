import java.math.BigInteger;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int left = 31;  // start from the leftmost bit
    int right = 0;  // start from the rightmost bit

    while (left > right) {
        // Get the bits at the left and right positions
        int leftBit = (n >> left) & 1;
        int rightBit = (n >> right) & 1;

        // If the bits are different, swap them
        if (leftBit != rightBit) {
            n ^= (1 << left) | (1 << right); // Toggle both bits
        }

        // Move towards the center
        left--;
        right++;
    }
        
        return n;

    }

   

}