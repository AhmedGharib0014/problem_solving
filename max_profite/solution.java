public class solution {

    public int maxProfit(int[] prices) {
        int profie = 0;
        if (prices.length <= 0) return 0;
        int minValue = prices[0];
        int maxValue = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < Math.max(minValue,maxValue)) {
                profie += calculateProfite(minValue, maxValue);
                minValue = prices[i];
                maxValue = Integer.MIN_VALUE;
            } else if(prices[i] > maxValue){
                maxValue = prices[i];
            }
        }
        profie += calculateProfite(minValue, maxValue);
        return profie;

    }

    int calculateProfite(int minValue, int maxValue) {
        if (maxValue == Integer.MIN_VALUE) return 0;
        else return maxValue-minValue;
    }
    

}
