/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    return traverse(root,p,q);
    }


    public  TreeNode traverse( TreeNode root, TreeNode p, TreeNode q){
        if(root == null ) return null;
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode leftVal= traverse(root.left,p,q);
        TreeNode rightVal=  traverse(root.right,p,q);
        
        if(leftVal == null && rightVal != null) return rightVal;
        if(rightVal == null && leftVal != null) return leftVal;
        if(rightVal != null && leftVal != null ) return root;
        
        return null;
    }



}