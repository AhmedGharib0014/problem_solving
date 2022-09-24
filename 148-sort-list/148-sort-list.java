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
    public ListNode sortList(ListNode head) {
         if(head == null)return null;

        PriorityQueue<ListNode> pQueue
            = new PriorityQueue<ListNode>((a,b)->((Integer) a.val).compareTo(b.val));

        ListNode current=head;
        ListNode newHead=null;


        while (current != null){
            pQueue.add(current);
            current=current.next;
        }
        
        
        
        while (!pQueue.isEmpty()){
            ListNode node=pQueue.poll();;
            if(newHead ==null){
                newHead=node;
            }else {
                current.next=node;
            }

            current=node;
            current.next=null;

        }
        
        
        return newHead;

    }
}