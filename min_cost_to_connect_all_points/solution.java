


class Solution {
    class Node{
       int x;
       int y;
       Node(int x, int y){
           this.x=x;
           this.y=y;
       }
   }
   public int minCostConnectPoints(int[][] points) {
       if(points.length <2) return 0;
       
       int result = 0;
       // create map of nodes
       Node currentNode = new Node(points[0][0],points[0][1]);
       HashMap<Node,Integer> nodesMap=new HashMap<Node,Integer>();
       for(int i=1;i<points.length;i++){
           nodesMap.put(new Node(points[i][0],points[i][1]),Integer.MAX_VALUE);
       }


       while (nodesMap.size()>0){
           Map.Entry<Node,Integer> nearestNode =null;
           for(Map.Entry<Node,Integer> entry : nodesMap.entrySet()){
               if(nearestNode == null) {
                   nearestNode= entry;             }
               int dist = distance(currentNode,entry.getKey());
               if(dist <  entry.getValue()){
                   entry.setValue(dist);
               }
               if(entry.getValue() < nearestNode.getValue()){
                   nearestNode=entry;
               }

           }
           currentNode=nearestNode.getKey();
           result += nearestNode.getValue();
           nodesMap.remove(currentNode);
       }
       
       return  result;
   }

   public int distance(Node first , Node second){
       return  (Math.abs(first.x - second.x) +
               Math.abs(first.y - second.y));
   }

}