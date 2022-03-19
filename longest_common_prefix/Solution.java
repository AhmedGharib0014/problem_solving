public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        int minlenth =Integer.MAX_VALUE;

        for(int i=0;i< strs.length;i++){
            if(strs[i].length()<minlenth) minlenth=strs[i].length();
        }
        int j;
        System.out.println(minlenth);
        for (j=0;j< minlenth;j++){
            Character curr = strs[0].charAt(j);
            int i;
            for( i=1;i< strs.length;i++){
                if(strs[i].charAt(j)!= curr) break;;
            }
           if(i != strs.length) break;

        }
        return strs[0].substring(0,j);

    }

    public static void main(String[] args) {
        String[]  arr={"dog","racecar","car"};
        System.out.println(longestCommonPrefix(arr) );
	// write your code here
    }
    
}
