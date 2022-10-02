class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if(i>0&& nums[i-1]== nums[i]) continue;
            twoSum(i+1,nums.length-1,-nums[i],nums,list);
        }



        return  list;
    }




    public void   twoSum (int low  , int high ,int target,int [] nums,List<List<Integer>> ans){

        while (low<high){
            int sum = nums[low]+nums[high];
            if(sum>target){
                high--;
            }else if(sum<target){
                low++;
            }else {
                ArrayList<Integer> list= new ArrayList<>();
                list.add(-target);
                list.add(nums[low]);
                list.add(nums[high]);
                ans.add(list);
                while (low<high && nums[low]== nums[low+1]) low++;
                while (high>low&& nums[high]== nums[high-1]) high--;
                low++;
                high--;
            }
        }
    }
}