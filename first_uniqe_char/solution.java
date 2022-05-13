public class solution {

    public int firstUniqChar(String s) {
        HashSet<Character> all = new HashSet<>();
        HashSet<Character> repeated = new HashSet<>();

        ArrayList<Integer> repitionNumbers = new  ArrayList<Integer>();
        for(Character ch : s.toCharArray()){
            if(all.contains(ch)){
                repeated.add(ch);
            }else{
                all.add(ch);
            }
        }

       for(int i=0;i<s.length();i++){
           if(! repeated.contains(s.charAt(i))) return i;
       }

        return -1;

    }
    
}
