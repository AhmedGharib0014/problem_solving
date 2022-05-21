public class solution {
    public boolean isValid(String s) {
        Stack<Character> characters=new Stack<Character>();
        Set<Character> closing = Set.of(']','}',')');


        for(int i=0;i<s.length();i++){
            if(closing.contains(s.charAt(i))){
                if(characters.empty()) return  false;
                if(checkValidPair(characters.pop(),s.charAt(i)) ) continue;
                else return false;
            }else{
                characters.push(s.charAt(i));
            }
        }
        return characters.empty();
    }


    public boolean checkValidPair(Character openingChar , Character closingChar){
        return ((openingChar=='(') && closingChar==')') ||((openingChar=='{') && closingChar=='}') || ((openingChar=='[') && closingChar==']');

    }
    
}
