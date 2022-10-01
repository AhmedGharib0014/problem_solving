class Solution {
    public String countAndSay(int n) {
        String str="1";
        if(n<=1 ) return "1";

        for(int i=1;i<n;i++){

            String str1="";

            for (int j = 0; j <str.length() ; j++) {
                int count =1;

                while (j+1<str.length() && str.charAt(j)==str.charAt(j+1)){
                    count++;
                    j++;
                }
                str1 += String.valueOf(count) + str.substring(j,j+1);
            }
            str = str1;
        }

        return str;
    }
}