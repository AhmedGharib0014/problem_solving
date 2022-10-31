class Solution {
    public int jump(int[] nums) {
      if(nums.length <= 1) return 0;
      int l = 0;
      int r = 0;
      int numberOfJum =0;

      while (r < nums.length-1){
          int max = r;

          for (int i = l; i < r+1 ; i++) {
              if(nums[i]+i > max) max = nums[i]+i;
          }

          l=r+1;
          r= max;
          numberOfJum++;


      }


      return numberOfJum;
    }
}