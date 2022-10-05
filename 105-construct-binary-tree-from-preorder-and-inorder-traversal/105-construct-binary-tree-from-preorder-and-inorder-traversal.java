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
        TreeNode head = new TreeNode(preorder[0]);
         Map<Integer, Integer> map =new HashMap<Integer,Integer>();
         Stack<TreeNode> stack= new Stack<>();
        TreeNode currrent=head;
         int index=1;
         stack.push(head);

        for (int i = 0; i <inorder.length ; i++) {
            map.put(inorder[i],i);
        }

        //implement stack logic
        while (index<preorder.length){
            
            TreeNode node= new TreeNode(preorder[index]);
           
            if(map.get(currrent.val)>map.get(preorder[index])){
                   currrent.left= node;
           }else{
                while ( !stack.isEmpty() && map.get(stack.peek().val)< map.get(preorder[index])){
                    currrent=stack.pop();
                }
                currrent.right= node;
                
            }
            stack.push(node);
            currrent= node;
            index++;
        }




        return head;
    }
}