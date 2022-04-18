class Solution {
    public TreeNode convertBST(TreeNode root) {
        int[] sum = {0};
        traverseTree(root,sum);
        return root;
        
    }
    
     public void traverseTree(TreeNode root,int [] sum ){
        if(root == null ) return  0;
         traverseTree(root.right,sum);  
         sum[0] += root.val;
         root.val=sum[0];
         traverseTree(root.left,sum);     
    }
}