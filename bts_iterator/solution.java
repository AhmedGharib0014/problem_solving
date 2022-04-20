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
    class BSTIterator {

        ArrayList<TreeNode> array=new ArrayList<TreeNode>();
           int i=-1;
   
           public BSTIterator(TreeNode root) {
               traverseTree(root,array);
           }
   
           public int next() {
                  i++;
                  return  array.get(i).val;
           }
   
           public boolean hasNext() {
               return i+1<array.size();
   
   
           }
       
        public void traverseTree(TreeNode root,ArrayList<TreeNode>  arry){
          if(root== null) return ;
          traverseTree(root.left,arry);
          arry.add(root);
          traverseTree(root.right,arry);
       }
   
   }
   
    
}
