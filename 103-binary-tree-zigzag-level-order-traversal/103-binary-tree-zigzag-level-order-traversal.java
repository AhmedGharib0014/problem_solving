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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null)  return  ans;
         Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        stack1.add(root);
        
        while (!stack1.isEmpty() || !stack2.isEmpty()){
           ArrayList<Integer> list1= new ArrayList<>();
            while (!stack1.isEmpty()){
                TreeNode node = stack1.pop();
                list1.add(node.val);
                if(node.left != null) stack2.push(node.left);
                if(node.right != null)stack2.push(node.right);
            }
            
            if(!list1.isEmpty()) ans.add(list1);

            list1= new ArrayList<>();

            while (!stack2.isEmpty()){
                TreeNode node = stack2.pop();
                list1.add(node.val);
                if(node.right != null)stack1.push(node.right);
                if(node.left != null) stack1.push(node.left);
            }
            if(!list1.isEmpty()) ans.add(list1);
        }
        return ans;

    }
}