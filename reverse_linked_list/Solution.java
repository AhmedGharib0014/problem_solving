public class Solution {

    public ListNode reverseList(ListNode head) {
        if( head==null ||head.next==null) return head;

        ListNode current = head.next;
        ListNode previos = head;
       
        while (current!= null){ 
                ListNode temp = current.next;
                current.next=previos;
                previos=current;
                current=temp;   
        }

        head.next=null;
        head=previos;
       
        return  head; 
    }
    
}
