class Solution {
   
    public int maxSubArray(int[] nums) {
          ArrayList<Integer> arrayList = new ArrayList<>();
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        for(int n : nums){
            sum += n;
            if(sum>maxSum) maxSum=sum;
            if(sum<0){
                arrayList.clear();
                sum=0;
            }else{
                arrayList.add(n);
                
            }


        }

        return maxSum;
    }




}