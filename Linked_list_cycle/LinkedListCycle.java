package Linked_list_cycle;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode first = head;
        ListNode second = head.next;

        while (second != null && second != first) {
            first = first.next;
            second = second.next.next;
        }

        if (first == second)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

    }

}
