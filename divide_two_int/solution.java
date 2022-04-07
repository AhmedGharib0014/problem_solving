class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==1<<31 && divisor ==-1) return  Integer.MAX_VALUE;
        int sign =1;
        if((dividend <0 && divisor >0)||(dividend >0 && divisor <0)) sign=-1;
        int result=0;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        while(dividend - divisor >=0){
            int count =0;
            while(dividend -(divisor<<1<<count) >=0) {
                count++;
            }

            result +=1<< count;
            dividend -= (divisor<<count);
        }
        if(sign == -1) return  0-result;
        return result ;
    }
}