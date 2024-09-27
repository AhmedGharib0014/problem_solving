/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
      public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 0;
        int bLength = 0;
        ListNode atemp = headA;
        ListNode btemp = headB;

        // calculate length
        ListNode tempLengthNode = headA;
        while (tempLengthNode != null) {
            tempLengthNode = tempLengthNode.next;
            aLength++;
        }
        tempLengthNode = headB;
        while (tempLengthNode != null) {
            tempLengthNode = tempLengthNode.next;
            bLength++;
        }

        // reset temp pointers
        if (aLength > bLength) {
            while (aLength > bLength) {
                atemp = atemp.next;
                aLength--;
            }

        } else {
            while (bLength > aLength) {
                btemp = btemp.next;
                bLength--;
            }
        }

        while (atemp != null && btemp != null) {
            if (atemp == btemp) return atemp;
            atemp = atemp.next;
            btemp = btemp.next;
        }

        return null;
    }
}