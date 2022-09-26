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
     public int maxPathSum(TreeNode root) {
        
         int[] arr={Integer.MIN_VALUE};
        return Math.max(inOrderTraverse(root,arr),arr[0]);

    }

    public  int inOrderTraverse(TreeNode root,int[] max ){
        if(root == null) return 0;
        int leftSum = inOrderTraverse(root.left,max);
        int rightSum = inOrderTraverse(root.right,max);
        int maxValue = Math.max(leftSum+root.val,rightSum+root.val);
        maxValue=Math.max(maxValue,root.val);
        max[0]= Math.max(max[0],maxValue);
        max[0]= Math.max(max[0],root.val+leftSum+rightSum);
        return maxValue;
    }
}