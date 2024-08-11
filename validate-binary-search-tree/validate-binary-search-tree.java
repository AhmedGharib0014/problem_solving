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
     public boolean isValidBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderTraverse(root, result);
        if (result.size() < 2) return true;

        for (int i = 1; i < result.size(); i++) {
            if (result.get(i - 1) >= result.get(i)) return false;
        }

        return true;
    }

    public void inOrderTraverse(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inOrderTraverse(root.left, result);
        result.add(root.val);
        inOrderTraverse(root.right, result);
    }
}