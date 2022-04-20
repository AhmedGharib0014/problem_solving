public class solution {
    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> nodeArray =  new ArrayList<>();
        traverseTree(root,nodeArray);
        int firstIndex=-1;
        
        for(int i=nodeArray.size()-1;i>0;i--){
            if(nodeArray.get(i).val < nodeArray.get(i-1).val) {
                if (firstIndex == -1) firstIndex = i;
            }
        }
        
        
        for(int i=0;i<nodeArray.size()-1;i++){
            if(nodeArray.get(i).val> nodeArray.get(firstIndex).val){
                 int val = nodeArray.get(firstIndex).val;
                 nodeArray.get(firstIndex).val= nodeArray.get(i).val;
                nodeArray.get(i).val=val;
                break;
            }
        }

    }

    public void traverseTree(TreeNode root,ArrayList<TreeNode>  arry){
       if(root== null) return ;
       traverseTree(root.left,arry);
       arry.add(root);
       traverseTree(root.right,arry);
    }
    
}
