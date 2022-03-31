public class findDuplicate {

    public static int findDuplicate(int[] nums) {
        int length = nums.length;
        int index=-1;

        for(int i=0;i<length;i++){
            nums[nums[i]%length] = nums[nums[i]%length]+length;
            
        }

        for(int i=0;i<length;i++){
           if(nums[i] / length > 1) {
               index=i;
               break;
           }
        }
        
        return index%length;

    }



    public static void main(String[] args) {
        int[] nums={3,1,4,2,3};
        System.out.println(findDuplicate(nums));
    }

    
}