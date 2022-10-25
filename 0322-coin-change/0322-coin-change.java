class Solution {
     public int coinChange(int[] coins, int amount) {

        int[] arr = new int[amount+1];
         
         arr[0]=0;

        for (int i = 1; i <= amount ; i++) {
            arr[i] = calculateMinChange(arr,coins,i);
        }

        return arr[amount];
    }

    private int calculateMinChange(int[] arr, int[] coins, int i) {
        int minNumberOfCoins = Integer.MAX_VALUE;
        
        for (int coin : coins){
            
            int temp=i-coin;
            if(temp >= 0 && arr[temp] != -1){
                minNumberOfCoins=Math.min(arr[temp]+1,minNumberOfCoins);
            }
            
        }

       return minNumberOfCoins != Integer.MAX_VALUE? minNumberOfCoins:-1;
    }
}