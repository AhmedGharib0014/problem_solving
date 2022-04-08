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
   
       public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
           Stack<TreeNode> stack1= new  Stack<TreeNode>();
           Stack<TreeNode> stack2= new  Stack<TreeNode>();
           List<List<Integer>> ans = new  ArrayList<List<Integer>>();
           if(root == null) return ans;
           stack1.push(root);
   
           while (!stack1.empty() || !stack2.empty() ){
               ArrayList<Integer> temp = new ArrayList<>();
               if(!stack1.empty()){
                   while (!stack1.empty()){
                       TreeNode node = stack1.pop();
                       if(node.left != null) stack2.add(node.left);
                       if(node.right != null) stack2.add(node.right);
                       temp.add(node.val);
                       System.out.println(node.val);
                   }
               }else if(!stack2.empty()){
                   while (!stack2.empty()){
                       TreeNode node = stack2.pop();
                       if(node.right != null) stack1.add(node.right);
                       if(node.left != null) stack1.add(node.left);
                       temp.add(node.val);
                   }
               }
               if(temp.size()>0) ans.add(temp);
   
           }
           return ans;
   
   
       }
}
