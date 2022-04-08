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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp=new ArrayList<>();
        if(root == null) return ans;
        preorderTraverse(root,targetSum,temp,ans);
        return ans;
        
    }
    
    public  void preorderTraverse(TreeNode root, int targetSum, ArrayList<Integer> temp,List<List<Integer>> ans){
        ArrayList<Integer> temp1 = new ArrayList<>(temp);
        temp1.add(root.val);
        targetSum -= root.val;
        if(root.left== null && root.right==null){
            if(targetSum==0){
                ans.add(temp1);
            }
            return;
        }
        if(root.left!= null )preorderTraverse(root.left,targetSum,temp1,ans);
        if(root.right != null)preorderTraverse(root.right,targetSum,temp1,ans);
    }
}