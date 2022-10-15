class Solution {
     public void sortColors(int[] nums) {
        if (nums.length<= 1)  return;
 
        int redIndex=-1;
        int bluIndex= nums.length;

        while (bluIndex>0 && nums[bluIndex-1] == 2) bluIndex--;
        
        while (redIndex+1 < nums.length  &&  nums[redIndex+1]==0) redIndex++;
        
        

        for (int i = redIndex+1; i < bluIndex; i++) {
            if(nums[i]==0){
                redIndex++;
                swap(redIndex,i,nums);
                while (redIndex+1 < nums.length  &&  nums[redIndex+1]==0) redIndex++;
            }
            
            if(nums[i]==2){
                bluIndex--;
                swap(bluIndex,i,nums);
                
                while (bluIndex>0 && nums[bluIndex-1] == 2)bluIndex--;
                
                if(nums[i]==0){
                redIndex++;
                swap(redIndex,i,nums);

                }
            }
       }

    }


    public  void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
    }


}