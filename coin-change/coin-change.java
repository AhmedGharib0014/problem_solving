class Solution {
     public int coinChange(int[] coins, int amount) {
        int[] nums = new int[amount + 1];
        nums[0] = 0;

        for (int i = 1; i < nums.length; i++) {

            int minNumberOfCoins = Integer.MAX_VALUE;
            

            for (int coin : coins) {
                
                int temp = i - coin;
        
               if ( temp >= 0 && nums[temp] != -1) {  
                    minNumberOfCoins = Math.min(nums[temp] + 1,minNumberOfCoins);
                }

            }
            
            
            nums[i] = minNumberOfCoins < Integer.MAX_VALUE ? minNumberOfCoins : -1;
          
        }

        return nums[amount];  
        
    }
}