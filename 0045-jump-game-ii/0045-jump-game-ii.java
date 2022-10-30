class Solution {
    public int jump(int[] nums) {
        int[] maxJums = new int[nums.length];
       
        for (int i = maxJums.length-2; i >= 0 ; i--) {
            
            if(nums.length -1  <= i+nums[i]) maxJums[i]=1;
            else {
                int min = Integer.MAX_VALUE;
                for (int j = i+1; j < i+nums[i]+1  ; j++) {
                    if(maxJums[j] < min) min= maxJums[j];
                }
                if(min != Integer.MAX_VALUE) maxJums[i] = min+1;
                else maxJums[i] = Integer.MAX_VALUE;
                }
            
        }
        
        
        return maxJums[0];
    }
}