class Solution {
    public int maxProfit(int[] prices) {
        int buyingIndex =0;
        int profit=0;
        if(prices.length <=1) return 0;
        for(int i =0;i<prices.length;i++){
            if(i != buyingIndex){
                if(prices[i]<prices[buyingIndex]){
                    buyingIndex=i;
                }else if(prices[i]-prices[buyingIndex] > profit){
                    profit= prices[i]-prices[buyingIndex];
                }
            }
        }

        return profit;
    }
}