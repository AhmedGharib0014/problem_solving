public class solution {
    public int[] sortArrayByParity(int[] nums) {
        int lastEventIndex=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 ==0){
                lastEventIndex ++;
                if(i != lastEventIndex) swap(nums,lastEventIndex,i);
            }

        }
        return  nums;

    }


    public  void swap(int[] nums,int i,int j){
       int temp= nums[i];
       nums[i]=nums[j];
       nums[j]=temp;
    }
    
}
