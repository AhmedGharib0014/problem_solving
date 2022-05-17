

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root= new TreeNode();
        return constactTree(root,nums,0,nums.length-1);
      
    }


    public TreeNode constactTree(TreeNode root ,int[] nums,int start, int end ){
        if(start > end ) return null;    
        root = new TreeNode();
        int med = start + (end-start)/2;
        root.val=nums[med];
        root.left= constactTree(root.left,nums,start,med-1);
        root.right =constactTree(root.right,nums,med+1,end);
        return root;
        
    }
}