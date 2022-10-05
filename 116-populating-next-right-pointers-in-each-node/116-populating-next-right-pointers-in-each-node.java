/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int lenght=0;
        
        while (!queue.isEmpty()){
           lenght=queue.size();
            Node current=null;
            Node prev=null;
            for (int i = 0; i < lenght; i++) {
                if(current == null){
                    current= queue.poll();
                    if(current!= null)queue.add(current.left);
                    if(current!= null) queue.add(current.right);
                    continue;
                }
                prev= current;
                current= queue.poll();
               if(prev!= null) prev.next= current;
               if(current!= null) queue.add(current.left);
               if(current!= null) queue.add(current.right);
            }
         if(current!= null)   current.next=null;
        }
         return root;
    }
}