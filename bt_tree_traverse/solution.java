/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        List<List<Integer>> ans = new  ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();
        if(root == null) return ans;
        queue.add(root);
        int nodes=queue.size();

        while (queue.size() > 0 ){
            TreeNode node = queue.remove();
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
            temp.add(node.val);
            nodes --;
            if(nodes==0){
                nodes=queue.size();
                ans.add(temp);
                temp=new  ArrayList<>();
            }
        }
        return ans;


    }
}