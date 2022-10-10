class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generateParenthesisOption("",0,0,n,ans);
        return ans;
    }


    public  void generateParenthesisOption(String option ,int openCount , int closedCount,int n,List<String> ans){
        if(option.length() == n*2){
            ans.add(option);
            return;
        }

        if(openCount < n ){
            generateParenthesisOption(option +'(',openCount+1,closedCount,n,ans);
        }

        if(closedCount<openCount){
            generateParenthesisOption(option +')',openCount,closedCount+1,n,ans);
        }
    }
}