class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character,String> input = new HashMap<>();
        input.put('2',"abc");
        input.put('3',"def");
        input.put('4',"ghi");
        input.put('5',"jkl");
        input.put('6',"mno");
        input.put('7',"pqrs");
        input.put('8',"tuv");
        input.put('9',"wxyz");

        generateCombination(digits,"",0,input,result);

        return result;


    }

    private void generateCombination(String digits,String combination, int i, Map<Character, String> input, List<String> result) {
        if(i >= digits.length()) {
            if(!combination.isEmpty()) result.add(combination);
            return;
        }

        String str = input.get(digits.charAt(i));

        for (Character ch : str.toCharArray()){
            generateCombination(digits,combination+ch,i+1,input,result);
        }

    }

}