public class solution {


    public void rotate(int[] nums, int k) {
        k=k% nums.length;
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);
    }


    public  void reverseArray(int[] nums , int start, int end){
        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start ++;
            end--;

        }
    }


    public void rotateWithanotherSolution(int[] nums, int k) {
        if(k==0 ||nums.length <2 || k==nums.length) return;

        int currentIndex =0;
        int currentValue = nums[0];


        boolean needshift = false;
        int period =  nums.length/k;
        for(int i=1;i<nums.length;i++){
            if((i*nums.length)%k==0){
                needshift=true;
                period=(i*nums.length)/k;
                break;
            }
        }



        for(int i=0;i<nums.length ;i++){
            int nexIndex= (currentIndex+k)% nums.length;
            int temp=nums[nexIndex];
            nums[nexIndex]=currentValue;
            currentValue=temp;
            currentIndex=nexIndex;
            if(needshift && (i+1)%period ==0){
                currentIndex ++;
                currentValue=nums[currentIndex];
            }
        }
    }



    
}
