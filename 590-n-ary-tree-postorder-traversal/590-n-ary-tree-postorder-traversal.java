/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
     ArrayList<Integer> ans = new ArrayList<>();
        traverseN(ans,root);
        return ans;
    }

    public  void traverseN(ArrayList<Integer> ans,Node root ){
        if(root == null) return;
        
        for (Node node: root.children){
            traverseN(ans,node);
        }
        ans.add(root.val);
    }
}