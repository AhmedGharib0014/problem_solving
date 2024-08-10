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
    ListNode head = null;
    ListNode current = head;
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    list1 = addNodeToNewList(list1);
                } else {
                    list2 = addNodeToNewList(list2);
                }

            } else if (list1 == null) {
                while (list2 != null) {
                    list2 = addNodeToNewList(list2);
                }
            } else {
                while (list1 != null) {
                    list1 = addNodeToNewList(list1);
                }
            }
        }


        return head;
    }
    
    ListNode addNodeToNewList(ListNode list) {
        if (current == null) {
            current = list;
            head = current;

        } else {
            current.next = list;
            current = current.next;
        }
        return list.next;
    }
}