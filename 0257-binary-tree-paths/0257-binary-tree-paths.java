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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfs(root,"",result);
        return result;
    }

    public void dfs(TreeNode treeNode, String currentString, List<String> result) {
          if (treeNode.left == null && treeNode.right == null) {
               if (!currentString.isEmpty()) {
            currentString += "->";
            }
            currentString += treeNode.val;
            result.add(currentString);
            return;
        }
        if (!currentString.isEmpty()) {
            currentString += "->";
        }
        currentString += treeNode.val;
        if (treeNode.left != null) {
            dfs(treeNode.left, currentString, result);
        }
        if (treeNode.right != null) {
            dfs(treeNode.right, currentString, result);
        }
    }
}