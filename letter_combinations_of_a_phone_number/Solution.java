public class Solution {
    class  Node{
        ArrayList<Node> childerens;
        Character value;
        Node(Character newValue, String stringValue){
            value = newValue;
            if(stringValue != null && stringValue.length()>0){
                childerens=new ArrayList<Node>();
                for(int i=0;i<stringValue.length();i++){
                    childerens.add(new Node(stringValue.charAt(i),null));
                }
            }
        };


    }

    public  List<String> letterCombinations(String digits) {
        HashMap<Character,String> phoneMap =new HashMap<Character,String>();
        List<String> ans = new ArrayList<>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");
        Node root=new Node(null,null);
       for(int i=0;i<digits.length();i++){
           treebuild(root,phoneMap.get(digits.charAt(i)));
       }
       printTree(root,"",ans);
       return ans;
    }


    public  void  treebuild(Node root, String value){
        if(root.childerens != null){
           for(Node child : root.childerens){
               treebuild(child,value);
           }
        }else{
            root.childerens=new ArrayList<Node>();
            for(int i=0;i<value.length();i++){
                root.childerens.add(new Node(value.charAt(i),null));
            }
        }
    }

    public  void printTree(Node root,String currentValue,List<String> ans){
            if(root.value != null) {
                currentValue=  currentValue.concat(root.value.toString());
            }
            if(root.childerens != null){
                for(Node n : root.childerens){
                    printTree(n,currentValue,ans);
                }
            }else{
                  if(!currentValue.isEmpty())
                ans.add(currentValue);
            }
            
    }
    
}
