class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;

        boolean[] numbersStatus = new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            numbersStatus[i]=true;
        }

        for(int i=2;i<n;i++){
            if(numbersStatus[i]){
                count++;
                for(int j=1;(j*i)<n;j++){
                    numbersStatus[j*i]=false;
                }
            }

        }
        return count;

    }
}