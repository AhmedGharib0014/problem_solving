class Solution {
    public int maxProfit(int[] prices) {
        int profite = 0;
        int smallest = prices[0];


        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < smallest) {
                smallest = prices[i];
            } else {
                if (prices[i] - smallest > profite) {
                    profite = prices[i] - smallest;
                }
            }
        }

        return profite;
    }
}