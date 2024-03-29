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
    public int sumOfLeftLeaves(TreeNode root) {
       int[] result = {0};
        calculateSum(root,result,false);
        return result[0];
    }

    public void calculateSum(TreeNode root, int[] result,boolean isLeft) {
        if (root.left == null && root.right == null) {
            if(isLeft) result[0] = result[0]+root.val;
            return ;
        }
         if (root.left != null) {
            calculateSum(root.left, result, true);
        }
        if (root.right != null) 
        calculateSum(root.right, result, false);
       
    }
}