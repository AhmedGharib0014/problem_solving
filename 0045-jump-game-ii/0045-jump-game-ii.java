class Solution {
    public int jump(int[] nums) {
        int[] maxJums = new int[nums.length];
       


        for (int i = maxJums.length-2; i >= 0 ; i--) {
            
            if(nums.length -1  <= i+nums[i]) maxJums[i]=1;
            else {
                int min = Integer.MAX_VALUE;
                for (int j = i+1; j < Math.min(i+nums[i]+1,nums.length)  ; j++) {
                    if(maxJums[j]>0 && maxJums[j] < min) min= maxJums[j];
                }
                if(min == Integer.MAX_VALUE) nums[i]= -1;
                else maxJums[i] = min+1;
                }
            
        }
        
        
        return maxJums[0];
    }
}