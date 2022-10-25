class Solution {
     public int coinChange(int[] coins, int amount) {

        int[] arr = new int[amount+1];

        for (int i = 1; i <= amount ; i++) {
            arr[i] = calculateMinChange(arr,coins,i);
        }

        return arr[amount];
    }

    private int calculateMinChange(int[] arr, int[] coins, int i) {
        int minNumberOfCoins = Integer.MAX_VALUE;
        for (int coin : coins){
            int temp=i-coin;
            if (temp == 0) return 1;
            if(temp>0 && arr[temp] != -1 && arr[temp] +1 < minNumberOfCoins){
                minNumberOfCoins=arr[temp]+1;
            }
        }

       return minNumberOfCoins != Integer.MAX_VALUE? minNumberOfCoins:-1;
    }
}