class Solution {
    public String longestPalindrome(String s) {
        int [][] dynamicArr =new int[s.length()][s.length()];
        int start=0;
        int end=0;


        // fill diagonal  and next to diagonal
        for(int i=0;i<s.length();i++){
            dynamicArr[i][i]=1;

            if(i<s.length()-1){
                if( s.charAt(i)==s.charAt(i+1)){
                    dynamicArr[i][i+1]=1;
                    if((end-start)<1) {
                        start=i;
                        end=i+1;
                    }
                }
            }
        }
        
        // fill other parts of the arr
        // k os difference -->2,3,4,
        for (int k = 2; k <= s.length(); k++) {
            for (int j = 0; j+k <s.length() ; j++) {
                if(s.charAt(j)==s.charAt(j+k) && dynamicArr[j+1][j+k-1] ==1){
                    dynamicArr[j][j+k]=1;
                    if(k >(end-start)){
                        end=j+k;
                        start=j;
                    }
                }
            }
        }

        return s.substring(start,end+1);
    }


}