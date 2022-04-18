class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] trackingValues = {k,0};
        traverseTree(root,trackingValues);
        return  trackingValues[1];

    }

    public void traverseTree(TreeNode root , int [] trackingValues){
        if(root == null) return  ;
        traverseTree(root.left,trackingValues);
        trackingValues[0] --;
        if(trackingValues[0]== 0 ) trackingValues[1]=root.val;
        traverseTree(root.right,trackingValues);
    }

 }