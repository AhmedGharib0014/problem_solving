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
        public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root != null) traverse(List.of(root), ans);
        return ans;
    }

    private void traverse(List<TreeNode> levelNodes, List<List<Integer>> ans) {
        if (levelNodes.isEmpty()) return;
        List<TreeNode> nextLevel = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();
        for (TreeNode node : levelNodes) {
            ansList.add(node.val);
            if (node.left != null) nextLevel.add(node.left);
            if (node.right != null) nextLevel.add(node.right);
        }
        ans.add(ansList);
        traverse(nextLevel, ans);
    }
}