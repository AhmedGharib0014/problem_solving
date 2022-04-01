public class solution {

    public static String intToRoman(int num) {
        String romanString="";
	    int[] breakPoints = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romainChars={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
 
       for(int i=0;i<breakPoints.length;i++){
           int x= num/breakPoints[i] ;
           romanString =  romanString.concat(romainChars[i].repeat(x));
           num -= (breakPoints[i]*x);
       }
        return romanString;
        
    }
    public static void main(String[] args) {
        
    }
}
