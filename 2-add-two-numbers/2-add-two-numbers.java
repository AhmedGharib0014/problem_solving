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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode ans =null;
         ListNode currentNode = null;
         
         int carry =0;

         while (l1!= null && l2 != null){
             int val = carry + l1.val + l2.val;
             carry=val/10;
             val=val%10;
             ListNode temp = new ListNode(val);
             
             l1=l1.next;
             l2=l2.next;
             
             if(ans == null){
                 ans=temp;
                 currentNode=temp;
             } else{
                 currentNode.next=temp;
                 currentNode=currentNode.next;
             } 
             
         }
         
         if(l1 != null){
             while (l1!= null){
                 int val = carry + l1.val;
                 carry=val/10;
                 val=val%10;
                 ListNode temp = new ListNode(val);
                 
                 l1=l1.next;

                 if(ans == null){
                     ans=temp;
                     currentNode=temp;
                 } else{
                     currentNode.next=temp;
                     currentNode=currentNode.next;
                 }
             }
        }


        if(l2 != null){
            while (l2!= null){
                int val = carry + l2.val;
                carry=val/10;
                val=val%10;
                ListNode temp = new ListNode(val);

                l2=l2.next;

                if(ans == null){
                    ans=temp;
                    currentNode=temp;
                } else{
                    currentNode.next=temp;
                    currentNode=currentNode.next;
                }
            }
        }
        
        if(carry>0){
            ListNode temp = new ListNode(carry);
            if(ans == null){
                ans=temp;
                currentNode=temp;
            } else{
                currentNode.next=temp;
                currentNode=currentNode.next;
            }

        }
        
        return ans;
    }
}