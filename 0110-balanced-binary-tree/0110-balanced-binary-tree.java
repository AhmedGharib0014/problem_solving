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
     class BalancedInfo{
        int height;
        boolean isBalanced;

        public BalancedInfo(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }


    public boolean isBalanced(TreeNode root) {
        return checkBalance(root).isBalanced;
        

    }
    
    public BalancedInfo checkBalance(TreeNode root){
        if(root == null) return new BalancedInfo(0,true);
        BalancedInfo left = checkBalance(root.left);
        BalancedInfo right = checkBalance(root.right);
        
        boolean balanced = left.isBalanced && right.isBalanced && (Math.abs(left.height-right.height) <=1); 
        
        return new BalancedInfo(Math.max(left.height,right.height)+1,balanced);
    }

}