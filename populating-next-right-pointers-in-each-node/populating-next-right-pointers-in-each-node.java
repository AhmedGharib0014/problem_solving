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

        while (!queue.isEmpty()) {
            int size = queue.size();
            Node node = null;
            
            for (int i = 0; i < size; i++) {
                node = queue.poll();
               if (node != null){
                    node.next = queue.peek();
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            
            if (node != null) {
                node.next = null;
            }

        }


        return root;

    }
}