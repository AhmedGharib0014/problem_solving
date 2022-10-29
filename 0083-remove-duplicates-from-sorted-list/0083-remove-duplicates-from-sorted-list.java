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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hashSet = new HashSet<>();
        ListNode listNode = null;
        ListNode current = head;

        while (current != null){
            if(!hashSet.contains(current.val)){
                 if(listNode != null){
                    listNode.next= current;
                }
                
                listNode= current;
                hashSet.add(current.val);
                hashSet.add(current.val);
                
            }
            
            current=current.next;
        }
         
        if(listNode != null)listNode.next= null;

        
        return head;
    }
}