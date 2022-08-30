class Solution {
   
    public int climbStairs(int n) {
        int f1=0;
        int f2=1;
        if(n <=0 ) return 0;
        while (n>0){
            int result = f1 + f2;
            f1=f2;
            f2=result;
            n--;

        }
        return f2;
    }
}