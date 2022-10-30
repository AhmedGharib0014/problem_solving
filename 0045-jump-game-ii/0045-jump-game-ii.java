class Solution {
    public int jump(int[] nums) {
        int[] maxJums = new int[nums.length];
        
        maxJums[nums.length-1]=0;
        
        for (int i = maxJums.length-2; i >= 0 ; i--) {
            
                maxJums[i] = Integer.MAX_VALUE;
            
            for (int j = i+1; j < Math.min(i + nums[i]+1 ,nums.length) ; j++) {
                if(maxJums[j] < maxJums[i]) maxJums[i]= maxJums[j]+1;
            }    
            
        }
        
        
        return maxJums[0];
    }
}