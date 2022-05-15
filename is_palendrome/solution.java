public class solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for(Character ch : s.toCharArray()){
            if(Character.isAlphabetic(ch)|| Character.isDigit(ch)){
                builder.append(ch);
            }
        }
        s=builder.toString().toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return  false;
            }
        }
        return true;

    }
    
}
