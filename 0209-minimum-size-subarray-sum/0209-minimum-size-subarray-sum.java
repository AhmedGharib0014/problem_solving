class Solution {
    public  int minSubArrayLen(int target, int[] nums) {
         if(nums.length ==0) return 0;

        int minLength = Integer.MAX_VALUE;
        int start=0;
        int sum=0;

        for (int end =0 ; end< nums.length; end++){
            sum += nums[end];

            while (sum>= target){
                if(end-start+1 < minLength){
                    minLength= end-start+1;
                }
                sum -= nums[start];
                start++;
            }
        }

      return minLength == Integer.MAX_VALUE ? 0:minLength;
    }
}