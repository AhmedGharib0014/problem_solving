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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
         
         ListNode oddStartPointer= head.next;
         ListNode even= head;
         ListNode odd = head.next;
         
          while (even.next!= null && odd.next != null){
              even.next = even.next.next;
              if(even.next!= null){
                  even= even.next;
              }
              
              odd.next = odd.next.next;
              if(odd.next != null){
                  odd=odd.next;
              }
          }
          
          even.next=oddStartPointer;
          
          return head;
    }
}