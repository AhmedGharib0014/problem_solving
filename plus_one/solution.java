public class solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int i=digits.length-1;
        
        do{
            int sum =digits[i]+carry;
            carry= sum/10;
            digits[i]=sum%10;
            i--;
        }while (carry != 0 && i>=0);
        
        if(carry == 0) return  digits;
        else{
            int[] result = new int[digits.length+1];
            result[0]=carry;
            for(int j=1;j<result.length;j++){
                result[j]=digits[j-1];
            }
          return result;
        }
    }
    
}
