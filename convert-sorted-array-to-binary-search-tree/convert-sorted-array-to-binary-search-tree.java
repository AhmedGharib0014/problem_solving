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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructTree(nums,0,nums.length-1);
    }

    public TreeNode constructTree(int[] nums, int start, int end) {
        if (start > end) return null;
        
        int mid = (start + end +1)/ 2;
        TreeNode treeNode = new TreeNode();
        treeNode.val = nums[mid];
        treeNode.left = constructTree(nums, start, mid-1);
        treeNode.right = constructTree(nums, mid+1 , end);
        return treeNode;
    }
}