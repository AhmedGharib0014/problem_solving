class Solution {
    public String removeDigit(String number, char digit) {
         int i = 0;
        int index = 0;
        for (i = 0; i < number.length() ; i++) {
            if (number.charAt(i) == digit) {
                if (i< number.length()-1 && number.charAt(i + 1) > number.charAt(i)) {
                    return number.substring(0, i) + number.substring(i + 1);
                } else {
                    index = i;
                }

            }
        }

        return number.substring(0, index) + number.substring(index + 1);
    }
}