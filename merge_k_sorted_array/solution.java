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
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode head=null;
            ListNode current=null;
            PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    if(o1.val>o2.val) return 1;
                    if(o1.val<o2.val)return -1 ;
                    return 0;
                }
            });
            for(ListNode node :lists){
                if(node != null)
                minHeap.add(node);
            }
            
            while (!minHeap.isEmpty()){
                ListNode node= minHeap.remove();
                if(head == null){
                    head=node;
                    current=node;
                    
                }
                if(node.next!= null) {
                    minHeap.add(node.next);
                }
                current.next=node;
                current=node;
            }
            if(current!=null)current.next=null;
          return head;

        }
    }