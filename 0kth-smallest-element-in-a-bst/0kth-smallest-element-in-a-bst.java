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
      public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        int count =0;



        while ( curr != null || !stack.isEmpty() ){
            while (curr != null) {
                stack.push(curr);
                curr = curr.left; 
            }
             curr = stack.pop();
             System.out.println(curr.val);
             count++;
             if(count == k) return curr.val;
             curr = curr.right;

        }
        
        return -1;

    }

    void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }
}