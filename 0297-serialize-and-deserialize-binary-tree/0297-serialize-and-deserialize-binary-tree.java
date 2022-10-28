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
            StringBuilder builder = new StringBuilder();

            preOrderTraverse(root,builder);

            return builder.toString();
        }

        public void preOrderTraverse(TreeNode treeNode, StringBuilder  builder){
            if(treeNode == null) {
                builder.append("*"+",");
                return;
            }
            builder.append(treeNode.val+",");
            preOrderTraverse(treeNode.left,builder);
            preOrderTraverse(treeNode.right,builder);
        }



        public TreeNode deserialize(String data) {
            if(data.isEmpty()) return null;
            TreeNode head= null;
            
            int[] position={0};
            String[] valuesStrings = data.split(",");

            
           head= reconstructTree(valuesStrings,position);

            return head;
        }

        public  TreeNode reconstructTree(String[] arr, int[] position ){
            if(position[0] >= arr.length || arr[position[0]].equals("*") )
                return null;
            
            TreeNode node = new TreeNode(Integer.parseInt(arr[position[0]]));
            
            position[0]++;
            node.left =reconstructTree(arr,position);
            
            position[0]++;
            node.right= reconstructTree(arr,position);
            return node;
        }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));