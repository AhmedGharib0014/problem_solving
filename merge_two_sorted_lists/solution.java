public class Solution {
    ListNode head=null ;
    ListNode current=null;
    if(list1 == null && list2 == null) return null; 
    if(list1==null)return list2;
      if(list2==null)return list1;
   if(list1.val <  list2.val){
       head=list1;
       current=list1;
       list1=list1.next;
   }else{
       head=list2;
       current=list2;
       list2=list2.next;
   }


    while (list1 != null && list2 != null){
        if(list1.val <  list2.val){
            current.next=list1;
            list1=list1.next;
            current=current.next;
          
        }else{
            current.next=list2;
            list2=list2.next;
            current=current.next;
        }
    }
    if(list1 != null)  current.next=list1;
    if(list2 != null) current.next=list2;
    return  head;

    
}
