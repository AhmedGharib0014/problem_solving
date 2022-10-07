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
        ArrayList<Integer> list = new ArrayList<Integer>();
        inOrderTraverse(root,k,list);
        return list.get(k-1);
    }
    
    public  void inOrderTraverse(TreeNode root,int k,ArrayList<Integer> list){
        if(root== null|| list.size() >= k) return ;
        inOrderTraverse(root.left,k,list);
        list.add(root.val);
        inOrderTraverse(root.right,k,list);
    }

}