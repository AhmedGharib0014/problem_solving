public class solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode first = head;
        ListNode prev=null;
        ListNode second = head.next;
        ListNode newHead=second;
        
        while( first != null && second != null  ){
            if(second.next != null){
                 first.next = second.next;
            }else{
                 first.next = null;
            }
           
            second.next=first;
            if(prev != null) prev.next=second;
            if(first != null && first.next != null){
                prev=first;
                first = first.next;
                second = first.next; 
               
            }else{
                first=null;
                second=null;
            }
            
            
            
         
        }
        
        return newHead;
        
    }
    
}
