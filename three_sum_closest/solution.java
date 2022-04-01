public class solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int differenc =0;
        if(target>0){
           differenc= ans-target;
        }else{
            differenc= ans+target;
        }
        
        for(int i=0;i<nums.length-2;i++){
            int k=nums.length-1;
            int j=i+1;
            while(j < k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum == target){
                    return  target; 
                }else if(sum > target){
                    if(sum-target < differenc) {
                        ans=sum;
                        differenc=sum-target;
                    }
                    k--;
                }else{
                    if(target-sum < differenc){
                        ans=sum;
                        differenc=target-sum ;
                    }
                    j++;
                }

            }
            while(i < nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }

        }
        return  ans;
        
    }

    
}
