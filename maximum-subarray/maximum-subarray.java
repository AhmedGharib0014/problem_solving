class Solution {
    public  int maxSumArrayWidow(int[] nums){
        if(nums.length == 0) return 0;

        int max=Integer.MIN_VALUE;

        for(int windowSize =1;windowSize <= nums.length;windowSize++){

            int sum =0;

            for(int j=0;j<windowSize;j++){
                sum += nums[j];
            }

            if(sum>max)max=sum;

            for(int j=windowSize;j<nums.length;j++) {
                sum -= nums[j - windowSize];
                sum += nums[j];
                if(sum>max)max=sum;
            }
        }

        return  max;
    }

   

    public int maxSumKadanes(int[] nums){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            arrayList.add(nums[i]);
            sum += nums[i];
            if(sum>maxSum) maxSum=sum;
            if(sum<0){
                arrayList.clear();
                sum=0;
            }
        }
        return maxSum;
    }
    public int maxSubArray(int[] nums) {
        return maxSumKadanes(nums);
    }


}