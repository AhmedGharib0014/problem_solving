public class solution {

    public void moveZeroes(int[] nums) {
        int firstZeroIndex=-1;
        int index ;
        for(index=0;index<nums.length;index++) {
            if (nums[index] == 0) {
                if(firstZeroIndex == -1) firstZeroIndex=index;
            }else if(firstZeroIndex!= -1 && firstZeroIndex<index){
                nums[firstZeroIndex]= nums[index];
                nums[index]=0;
                firstZeroIndex++;
            }
        }
    }
    
}
