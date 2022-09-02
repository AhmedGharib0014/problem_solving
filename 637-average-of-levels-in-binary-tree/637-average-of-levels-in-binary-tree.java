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
    public List<Double> averageOfLevels(TreeNode root) {
             ArrayList<Double> result = new ArrayList<>();
             if(root == null) return result;
        
             Queue<TreeNode> pq = new LinkedList<>();
             int nextLevelCount = 1;
              pq.add(root);


             while (pq.size()>0){
                 nextLevelCount=calculateAverageOfLevel(pq,nextLevelCount,result);
             }
        
             return result;
      }
    
    public  int calculateAverageOfLevel(Queue<TreeNode> pq ,int levelNodesCount,
                                        ArrayList<Double> resul){
          Double sum=0.0;
          int nextLevelNodesCount=0;

          for(int i=0;i<levelNodesCount;i++){
              TreeNode curr = pq.poll();
              sum += curr.val;

              if(curr.left!= null){
                  pq.add(curr.left);
                  nextLevelNodesCount++;
              }
              if(curr.right != null){
                  pq.add(curr.right);
                  nextLevelNodesCount++;
              }

          }

          resul.add(sum/levelNodesCount);
          return nextLevelNodesCount;

     }
}
