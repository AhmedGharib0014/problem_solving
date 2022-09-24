/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node result = null;
        
        Node current = head;
       
        HashMap<Node,Node> map = new HashMap<>();

        while (current != null){
            Node newNode = null;
            
            if(!map.containsKey(current)) {
                newNode = new Node(current.val);
            }else {
                newNode= map.get(current);
            }
            
             map.put(current,newNode);
            
            
            if(current.next != null){
                if(!map.containsKey(current.next)){
                    Node newNextNode = new  Node(current.next.val);
                    map.put(current.next,newNextNode);
                }

                newNode.next=map.get(current.next);

            }

            if(current.random != null){
                if(!map.containsKey(current.random)){
                    Node newNextNode = new  Node(current.random.val);
                    map.put(current.random,newNextNode);
                }
                newNode.random=map.get(current.random);
            }

           
            
            if(result==null) result=newNode;
            
            current= current.next;
            
        }
        
        
        return result;
        
    }
}