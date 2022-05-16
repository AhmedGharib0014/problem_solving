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
       return  isValidNode(root,Long.MIN_VALUE,Long.MAX_VALUE);
   }
   
   public boolean isValidNode(TreeNode root, long min , long max) {
       if(root== null) return  true;
       return  root.val > min && root.val < max && isValidNode(root.left,min,root.val) && isValidNode(root.right,root.val,max);
   }
   
   
//     public boolean isValidBST(TreeNode root) {
//         ArrayList<Integer> arrayList = new ArrayList<Integer>();
//         inOrderTraverse(root,arrayList);
//         for(int i=0;i<arrayList.size()-1;i++){     
//             if(arrayList.get(i+1) <= arrayList.get(i) ) return false;
//         }
//         return true;

//     }


//     public void inOrderTraverse(TreeNode root , ArrayList<Integer> list){
//         if(root == null) return;
//         inOrderTraverse(root.left,list);
//         list.add(root.val);
//         inOrderTraverse(root.right,list);
//     }
}