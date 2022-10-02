class Solution {
    
    

   public List<List<String>> groupAnagrams(String[] strs) {

        
        HashMap<String,List<String>> map = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for (String s:strs){
            String key = identifier(s);
            List<String> l= map.getOrDefault(key,new ArrayList<>());
            l.add(s);
            map.put(key,l);
        }

        for (List value : map.values()){
            ans.add(value);
        }

        return ans;




    }
    
     public String identifier(String s ){
       int [] chararray = new int[26];
        String identifier="";


        for (Character c : s.toCharArray()){
           chararray[c-'a'] +=1;
        }

        for (char i = 'a'; i <= 'z' ; i++) {
            identifier += chararray[i - 'a'] +String.valueOf(i);
        }



        return identifier;

    }


  

}