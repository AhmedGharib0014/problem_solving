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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        int nodePosition = 0;

        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }
        
        nodePosition = size - n;
        if(nodePosition < 1) return head.next;
        
        current = head;
        for (int i = 0; i < nodePosition-1; i++) {
          current= current.next;  
        }
        current.next = current.next != null ? current.next.next:current.next;
        
        return head;

    }
}