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
     public List<Double> averageOfLevels(TreeNode root)
    {
        ArrayList<Double> result = new ArrayList<>();
        if(root == null) return result;

        int currentLevelIndex=1;
        int currentLevelCount=1;

        int nextLevelCount=0;
        Double levelSum=0.0;
       Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);


        while (pq.size()>0){
            TreeNode curr = pq.poll();
            levelSum += curr.val;
            currentLevelIndex --;
            if(curr.left!= null){
                    pq.add(curr.left);
                    nextLevelCount++;
                }
                if(curr.right != null){
                    pq.add(curr.right);
                    nextLevelCount++;
                }
            if(currentLevelIndex==0){
                currentLevelIndex=nextLevelCount;
                nextLevelCount=0;
                result.add(levelSum/currentLevelCount);
                levelSum=0.0;
                currentLevelCount=currentLevelIndex;

            }

        }
        return result;
    }

}
