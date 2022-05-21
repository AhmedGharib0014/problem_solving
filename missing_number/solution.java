public class solution {
    public int missingNumber(int[] nums) {
        int elementSum=0;
       int n = nums.length;
       int sum = (n *(n+1))/2;
       for (int i : nums){
           elementSum += i;
       }
       return  sum - elementSum;
       
   }
    
}
