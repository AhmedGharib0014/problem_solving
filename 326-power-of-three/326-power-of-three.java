class Solution {
    public boolean isPowerOfThree(int n) {
      if(n==1) return true;
       while (n>1){
           if(n%3 != 0) break;;
           n /=3;

       }
       return n==1;



    }
}