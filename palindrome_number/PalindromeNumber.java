public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x<0) return false;
	    int rightIndex=-1;
	    int leftIndex =-1;
	    String numberString = Integer.toString(x);
	    if(numberString.length() % 2 == 0){
	        rightIndex = numberString.length()/2;
	        leftIndex = rightIndex-1;
	        
	    }else{
	        leftIndex = numberString.length()/2-1;
	        rightIndex = leftIndex+2;
	        
	    }
	    
	    while(leftIndex >= 0 && rightIndex<numberString.length()){
	        if(numberString.charAt(leftIndex) == numberString.charAt(rightIndex)){
	            leftIndex =leftIndex -1;
	            rightIndex =rightIndex +1 ;
	        }else {
                return false;
	        }
	    }
	    
	   return true;
        
    }

    public static void main(String[] args) {
       
        System.out.println(isPalindrome(10));
    }
    
}
