public class Solution {
    

    public static int romanToInt(String s) {
        HashMap<String,Integer> romanMap= new HashMap<String, Integer>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);
        romanMap.put("IV",4);
        romanMap.put("IX",9);
        romanMap.put("XL",40);
        romanMap.put("XC",90);
        romanMap.put("CD",400);
        romanMap.put("CM",900);

        int i=0;
        int sum=0;
        while (i< s.length()){
           if(i+2<=s.length() && romanMap.containsKey(s.substring(i,i+2))) {
               sum += romanMap.get(s.substring(i,i+2));
               i +=2;
           } else {
               sum +=  romanMap.get(s.substring(i,i+1));
               i++;
           }

        }

        return sum;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
	// write your code here
    }

}
