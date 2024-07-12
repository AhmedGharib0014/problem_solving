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
   public int maxDepth(TreeNode root) {
        
        if (root == null) return 0;
        int depth =0;

        Queue<TreeNode> levelNodes = new LinkedList<>();
        levelNodes.add(root);
        
        while (!levelNodes.isEmpty()){
            
            int size = levelNodes.size();
            depth++;

            for (int i = 0; i < size; i++) {
                TreeNode node = levelNodes.poll();
                if (node.right != null) levelNodes.add(node.right);
                if (node.left != null) levelNodes.add(node.left);
            }
            
        }
        
        return depth;
        

    }
}