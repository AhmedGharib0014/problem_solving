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
       ListNode head = null;
        ListNode currentNode = null;
        int carry = 0;

        while (l1 != null && l2 != null) {
            ListNode temp = new ListNode();
            int sum = l1.val + l2.val + carry;
            temp.val = sum % 10;
            carry = sum / 10;

            if (currentNode == null) {
                currentNode = temp;
            } else {
                currentNode.next = temp;
                currentNode = currentNode.next;
            }

            if (head == null) {
                head = currentNode;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 != null) {
            while (l2 != null) {
                ListNode temp = new ListNode();
                int sum = l2.val + carry;
                temp.val = sum % 10;
                carry = sum / 10;

                if (currentNode == null) {
                    currentNode = temp;
                } else {
                    currentNode.next = temp;
                    currentNode = currentNode.next;
                }

                if (head == null) {
                    head = currentNode;
                }

                l2 = l2.next;
            }
        }

        if (l1 != null && l2 == null) {
            while (l1 != null) {
                ListNode temp = new ListNode();
                int sum = l1.val + carry;
                temp.val = sum % 10;
                carry = sum / 10;

                if (currentNode == null) {
                    currentNode = temp;
                } else {
                    currentNode.next = temp;
                    currentNode = currentNode.next;
                }

                if (head == null) {
                    head = currentNode;
                }

                l1 = l1.next;
            }
        }

        if (carry > 0) {
            ListNode temp = new ListNode();
            temp.val = carry;
            currentNode.next = temp;
        }


        return head;
    }
}