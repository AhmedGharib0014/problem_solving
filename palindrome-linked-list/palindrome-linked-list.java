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
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode current = head;
        ListNode tail = null;

        // calculate size
        while (current != null) {
            size++;
            current = current.next;
        }

        current = head;

        for (int i = 0; i < size / 2 ; i++) {
            current = current.next;
        }

        tail = reverseList(current);

        for (int i = 0; i < size / 2; i++) {
            if (head.val != tail.val) return false;
            head = head.next;
            tail = tail.next;
        }


        return true;
    }

    public ListNode reverseList(ListNode head) {
        if (head.next == null) return head;
        ListNode current = head;
        ListNode next = head.next;


        while (next != null) {
            ListNode temp = next.next;
            next.next = current;
            current = next;
            next = temp;
        }

        return current;
    }

}