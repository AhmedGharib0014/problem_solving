/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

   // Encodes a tree to a single string.
           public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return "";
        queue.add(root);
        list.add(String.valueOf(root.val));

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.add(current.left);
                    list.add(String.valueOf(current.left.val));
                } else {
                    list.add("*");
                }

                if (current.right != null) {
                    queue.add(current.right);
                    list.add(String.valueOf(current.right.val));
                } else {
                    list.add("*");
                }
            }
        }


        return list.stream().collect(Collectors.joining(","));
    }


    public TreeNode deserialize(String data) {
       if (data.isEmpty()) return null;
        String[] arr = data.split(",");

        TreeNode root = getTreeNode(arr, 0);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int index = 1;


        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                TreeNode left = getTreeNode(arr, index);
                current.left = left;
                if (left != null) queue.add(left);
                index++;

                TreeNode right = getTreeNode(arr, index);
                current.right = right;
                if (right != null) queue.add(right);
                index++;

            }


        }


        return root;
    }

    private TreeNode getTreeNode(String[] arr, int index) {
        if (arr[index].equals("*")) return null;
        TreeNode root = new TreeNode();
        root.val = Integer.valueOf(arr[index]);
        return root;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));