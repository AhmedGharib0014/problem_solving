/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
       ListNode next = node.next;

        do {
            node.val = next.val;
            next = next.next;
            if(next == null){
               node.next = null;
            }else{
              node= node.next;
            }
            
        }while (next != null);
        
        node.next= null;
    }
}