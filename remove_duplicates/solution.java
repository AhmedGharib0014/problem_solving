public class solution {

    public int removeDuplicates(int[] nums) {
        
        if(nums.length <= 1) return  1;
        
        int i=-1;
        for(int j=0;j< nums.length-1;j++){
           if(nums[j]==nums[j+1]) continue;
           else{
               i++;
               nums[i]=nums[j];
           }
        }
        if(i == -1) return 1;

        if( nums[nums.length-1] != nums[i]){
            i++;
            nums[i]=nums[nums.length-1];
        }

        return  i+1;
    }
    
}
