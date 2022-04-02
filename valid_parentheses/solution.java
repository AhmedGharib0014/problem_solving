public class solution {

    public boolean isValid(String s) {
        Set<Character> openSet = new HashSet<Character>();
        openSet.addAll(Set.of('(', '{', '['));
        Stack<Character> stack1 = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (openSet.contains(s.charAt(i))) {
                stack1.push(s.charAt(i));   
            }else {
                if (stack1.empty()) return false;
                Character val = stack1.pop();
                switch (s.charAt(i)) {
                    case ')':
                        if (val != '(') return false;
                        break;
                    case '}':
                        if (val != '{') return false;
                        break;
                    case ']':
                        if (val != '[') return false;
                        break;
                }

            }
        }

        if (stack1.empty()) return true;
        else return false;
    }
    
}
