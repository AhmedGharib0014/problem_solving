public class solution {


    public void threeSum(int[] nums,int value ,int targer,List<List<Integer>> result) {
        for(int i=0;i<nums.length-2;i++){
            int k=nums.length-1;
            int j=i+1;
            while(j < k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum == targer){
                    List<Integer> temp= new ArrayList<Integer>();
                    temp.add(value);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);

                    do{
                        j++;
                    }while(j < nums.length-1 && nums[j-1] == nums[j]) ;

                }else if(sum > targer){
                    k--;
                }else{
                    j++;

                }

            }
            while(i < nums.length-1 && nums[i]==nums[i+1]){
                i++;
            }

        }


    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-3;i++){
            int[] sub = Arrays.copyOfRange(nums,i+1,nums.length);
            threeSum(sub,nums[i],target-nums[i],result);
            while(i<nums.length-1 &&nums[i] == nums[i+1]){
                i++;
            }
        }
        
        return  result;

    }

    
}
