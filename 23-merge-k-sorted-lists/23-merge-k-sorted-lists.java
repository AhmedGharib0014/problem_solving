/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;
        ListNode current = null;
        
        
        if(lists.length == 0)return null;

        PriorityQueue<ListNode> pQueue
            = new PriorityQueue<ListNode>(
        (a,b)->((Integer) a.val).compareTo(b.val)
        );
        
        for (ListNode  node : lists){
           if(node != null) pQueue.add(node);
        }
        
        while (!pQueue.isEmpty()){
            ListNode node=pQueue.poll();
            
            
            if(result ==null) {
                current=node;
                result=current;
            }else {
                current.next=node;
                current=node;
                System.out.println(node.val);
            }
            if(node.next!= null) pQueue.add(node.next);
            
        }
        
        
        
        return result;
        
    }
}