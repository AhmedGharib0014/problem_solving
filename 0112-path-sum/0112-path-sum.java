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
   public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root == null) return false;
        return checkPathSum(root,0,targetSum);

    }
    
    public boolean checkPathSum(TreeNode root,int currentSum ,int targetSum){
        if (root.left == null && root.right == null) return currentSum+root.val == targetSum;
        
        if(root.left != null && checkPathSum(root.left,currentSum+root.val,targetSum)) return true;
        if(root.right != null &&  checkPathSum(root.right,currentSum+root.val,targetSum)) return true;
        
        return false;
        
    }
}