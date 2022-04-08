class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans= new ArrayList<List<Integer>>();
       calculatepermutation(nums,ans,new ArrayList<Integer>());
       return  ans;

   }

   public  void calculatepermutation(int[] nums , List<List<Integer>> ans , ArrayList<Integer> current){
       if(current.size() == nums.length ){
           ans.add(current);
           return;
       }
       for(int n : nums){
           if(!current.contains(n)){
               ArrayList<Integer> temp = new ArrayList<Integer>(current);
               temp.add(n);
               calculatepermutation(nums,ans,temp);
           }

       }
   }
}