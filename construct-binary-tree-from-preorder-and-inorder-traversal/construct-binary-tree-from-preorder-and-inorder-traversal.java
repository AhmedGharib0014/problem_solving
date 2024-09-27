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
          public TreeNode buildTree(int[] preorder, int[] inorder) {

        return buildAnode(0, preorder.length - 1, preorder, 0, preorder.length - 1, inorder);

    }

    int indexOf(int value, int[] inorder) {
        int index = 0;

        for (int j : inorder) {
            if (j == value) break;
            index++;
        }
        return index;
    }

    public TreeNode buildAnode(int preStart, int preEnd, int[] preorder, int inStart, int inEnd, int[] inorder) {
        if (preStart > preEnd) return null;
        TreeNode treeNode = new TreeNode();
        treeNode.val = preorder[preStart];

        int indexOfParentValue = indexOf(treeNode.val, inorder);
        treeNode.left = buildAnode(preStart + 1, preStart + (indexOfParentValue - inStart), preorder, inStart, indexOfParentValue, inorder);
        treeNode.right = buildAnode(preStart + (indexOfParentValue - inStart) + 1, preEnd, preorder, indexOfParentValue + 1, inEnd, inorder);
        return treeNode;
    }

}