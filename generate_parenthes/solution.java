public class solution {
    public List<String> generateParenthesis(int n) {
        List<String>  ans= new ArrayList<>();
        constractOption(n,"",0,0,ans);
        return  ans;
    }

    public void constractOption(int n,String currentString,int openCount ,int closedCount,List<String> ans){
       if(openCount==closedCount && openCount==n) {
           ans.add(currentString);
           return;
       }
       if(openCount < n && openCount >= closedCount ) {
           constractOption(n, currentString.concat("("), openCount+1, closedCount, ans);
       }
       if(closedCount < n && openCount >  closedCount){
           constractOption(n,currentString.concat(")"),openCount,closedCount+1,ans);
       }

    }
    
}
