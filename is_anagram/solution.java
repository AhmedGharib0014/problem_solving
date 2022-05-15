class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> charsMap = new HashMap<Character,Integer>();
      if(s.length() != t.length()) return  false;
        for(Character ch : s.toCharArray()){
            int value=0;
            if(charsMap.containsKey(ch)){
               value =  charsMap.get(ch);
            }
            charsMap.put(ch,value+1);
        }

        for(Character ch : t.toCharArray()){
            if(charsMap.containsKey(ch)){
                int value = charsMap.get(ch);
                if(value == 1)
                    charsMap.remove(ch);
                else {
                    value --;
                    charsMap.put(ch,value);
                }
            }else{
               break;
            }

        }

        return  charsMap.size() == 0  ;
        
    }
}