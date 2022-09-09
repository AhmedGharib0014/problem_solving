class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length){
            if(nums[i] == i+1) i++;
            else if(nums[i]<1 || nums[i]>nums.length) {
                nums[i]=0;
                i++;
            }
            else if (nums[i]== nums[nums[i]-1]) {
                i++;
            } 
            else {
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]= nums[i];
                nums[i]=temp;
            }
        }


        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) return j+1;
        }

        return nums.length+1;
    }
}