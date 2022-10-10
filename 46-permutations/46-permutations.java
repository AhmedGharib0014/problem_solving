class Solution {
   public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<List<Integer>>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        calculatePermutation(set,nums.length,ans,new ArrayList<Integer>());
        return  ans;
    }

    public  void calculatePermutation(Set<Integer> set,int length, List<List<Integer>> ans , ArrayList<Integer> current){
        if(current.size() == length ){
            ans.add(current);
            return;
        }

        set.forEach((e)->{
            ArrayList<Integer> temp = new ArrayList<Integer>(current);
            temp.add(e);
            Set<Integer> newSet = new HashSet<>(set);
            newSet.remove(e);
            calculatePermutation(newSet,length,ans,temp);
        });

    }

}