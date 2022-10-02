class Solution {
    public String minWindow(String s, String t) {
        if(s== null || t == null || s.isEmpty() || t.isEmpty()) return  "";

        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
        for (Character c : t.toCharArray())
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);


        int i=0;
        int j=0;
        int left=0;
        int right= s.length();
        int count =hashMap.size();
        int min= s.length();
        boolean found=false;


        while (j<s.length()){
            Character currChar = s.charAt(j++);
            if(hashMap.containsKey(currChar)){
                hashMap.put(currChar,hashMap.get(currChar)-1);
                if(hashMap.get(currChar)==0) count --;
            }

            if(count  > 0) continue;;

            while (count==0){
                Character startChar = s.charAt(i++);
                if(hashMap.containsKey(startChar)){
                    hashMap.put(startChar,hashMap.get(startChar)+1);
                    if(hashMap.get(startChar)>0) count ++;
                }
            }

            if(j-i < min){
                left=i;
                right=j;
                min=j-i;
                found=true;
            }

        }


        return !found?"":s.substring(left-1,right);


    }
}