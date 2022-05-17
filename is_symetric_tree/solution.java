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
      public boolean isSymmetric(TreeNode root) {
          if(root ==null) return  true;
          ArrayList<Integer> treeList = new ArrayList<Integer>();
          inOrderTraverse(root,treeList);
          for(int i =0; i<treeList.size()/2;i++){
              if(treeList.get(i) != treeList.get(treeList.size()-i-1)) return false;
          }
          return true;
      }
  
      public  boolean isSemetricSubtrees(TreeNode left, TreeNode right){
          if(left == null || right == null){
              return  left == right;
          }
          return  left.val == right.val && isSemetricSubtrees(left.left,right.right) && isSemetricSubtrees(left.right,right.left);
      }    
}
