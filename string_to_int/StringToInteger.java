public class StringToInteger {

    public static int myAtoi(String s) {

        boolean positive = true;
        int startindex =-1;
        int endIndex = -1;

        int j = 0;
        while (j<s.length() && s.charAt(j)==" ".charAt(0)){
            j++;
        }

        if (j < s.length()) {
            if (s.charAt(j) == "-".charAt(0)) {
                positive = false;
                j++;
            } else if (s.charAt(j) == "+".charAt(0)) {
                positive = true;
                j++;
            }
        }



        while  (j<s.length() && Character.isDigit(s.charAt(j))){
            if(startindex ==-1) startindex=j;

            j++;
            endIndex=j;
        }


       try{
           if(positive){
               Double ans=  Double.parseDouble(s.substring(startindex,endIndex));
               if(ans> Integer.MAX_VALUE) return  Integer.MAX_VALUE;
               else return (int)  Math.round(ans);
           }else{
               Double ans =  -1* Double.parseDouble(s.substring(startindex,endIndex));
               if(ans < Integer.MIN_VALUE) return  Integer.MIN_VALUE;
               else return (int)  Math.round(ans);
           }
       }catch (Exception e){
           return 0;
       }

    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" -1292"));
	// write your code here
    }
    
}
