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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
             List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        if(root == null) return result;
        boolean isLefttoRight = true;
        deque.add(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            ArrayList<Integer> list = new ArrayList();
            for (int i = 0; i < size; i++) {
                if (isLefttoRight) {
                    TreeNode top = deque.pollFirst();
                    list.add(top.val);
                    if (top.left != null) deque.addLast(top.left);
                    if (top.right != null) deque.addLast(top.right);

                } else {
                    TreeNode top = deque.pollLast();
                    list.add(top.val);
                    if (top.right != null) deque.addFirst(top.right);
                    if (top.left != null) deque.addFirst(top.left);
                }

            }
            result.add(list);
            isLefttoRight = !isLefttoRight;
        }

        return result;

    }
}