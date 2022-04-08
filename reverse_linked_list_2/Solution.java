public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int index =1;
       if(left >= right) return head;
       ListNode current = head;
       ListNode previos = null;
       ListNode newHead =null;

       while (index<=right){ 
           if(index==left) newHead=previos;
           if(index > left && index <= right){
               ListNode temp = current.next;
               current.next=previos;
               previos=current;
               current=temp;
           } else{
               previos=current;
               current=current.next;
           }
           index++;
       }
      if(left != 1){
          newHead.next.next=current;
          newHead.next=previos;
      }else{
         head.next=current;
         head=previos; 
      }
       
       return  head;
   }
    
}
