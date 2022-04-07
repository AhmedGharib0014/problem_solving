public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
  
      public ListNode removeNthFromEnd(ListNode head, int n) {
          Queue<ListNode> q
                  = new LinkedList<>();
          ListNode current = head;
          while (head.next != null){
              if(q.size()==n+1){
                  q.remove();
                  q.add(current);
              }
              current=current.next;
          }
          ListNode first= q.remove();
          current=q.remove();
          first.next=q.peek();
          return current;
  
  
      }
  
    
}
