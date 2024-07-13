class Solution {
     public int maxProfit(int[] prices) {
        int profite = 0;
        int smallestIndex = 0;


        for (int i = 0; i < prices.length; i++) {
            while (i + 1 < prices.length && prices[i + 1] > prices[i]) i++;
            if (i < prices.length) {
                profite += prices[i] - prices[smallestIndex];
                smallestIndex = i + 1;
            }

        }

        return profite;
    }

}