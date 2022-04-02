public class solution {
    public int removeElement(int[] nums, int val) {
       
        int i=-1;
        for(int j=0;j< nums.length;j++){
           if(nums[j]== val) continue;
           else{
               i++;
               nums[i]=nums[j];
           }
        }
        if(i == -1) return  0;
        return  i+1;
        
    }
}
