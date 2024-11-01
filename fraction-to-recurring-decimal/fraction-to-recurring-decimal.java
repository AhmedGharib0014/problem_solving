class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        if(denominator==1) return String.valueOf(numerator);
        
         if (numerator == Integer.MIN_VALUE && denominator == -1)
            return String.valueOf(Math.abs((Integer.MAX_VALUE + (long) 1)));

        
        StringBuilder result = new StringBuilder();

        if ((numerator < 0) != (denominator < 0)) {
            result.append("-");
        }
        
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        result.append(Math.abs(numerator / denominator));

        long remainder = numerator % denominator;

        if (remainder == 0) return result.toString();
        else result.append(".");

        HashMap<Long, Integer> map = new HashMap<>();

        while (!map.containsKey(remainder) && remainder != 0) {
            map.put((long) remainder, result.length());
            int temp =(int) (10 * remainder / denominator);
            result.append(Math.abs(temp));
            remainder = 10 * remainder % denominator;
        }

        if (remainder != 0) {
            result.insert(map.get(remainder), "(");
            result.append(")");
        }



        return result.toString();
    }
}