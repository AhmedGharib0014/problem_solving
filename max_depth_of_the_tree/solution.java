public class solution {
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
      public int maxDepth(TreeNode root) {
          return  traverseTree(root);
  
      }
      
      public int traverseTree(TreeNode root){
          if(root== null) return  0;
          int left = traverseTree(root.left);
          int right= traverseTree(root.right);
          return  Math.max(left,right);
      }
    
}
