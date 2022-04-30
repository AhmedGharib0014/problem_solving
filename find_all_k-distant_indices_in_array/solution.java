class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
       ArrayList<Integer> result=new ArrayList<Integer>();
       int lastselectedIndx=0;
       for(int i=0; i<nums.length;i++){
           if(nums[i] == key){
               int start = Math.max(i-k,lastselectedIndx);
               int end = Math.min(i+k+1,nums.length);
               for(int j =start ;j<end;j++){
                   if(!result.contains(j)) result.add(j);
               }
               lastselectedIndx=end;
           }
       }
       return result;
   }

}