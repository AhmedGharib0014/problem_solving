package add_tow_numbers;

class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null)
            return l2;
        else if (l2 == null && l1 != null)
            return l1;

        int carry = 0;
        ListNode head = null;
        ListNode current = null;

        while (l1 != null || l2 != null || carry != 0) {
            ListNode newNode = new ListNode(0);
            int value = l1.val + l2.val + carry;
            carry = value / 10;
            newNode.val = value % 10;
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }

        return head;

    }

    public static void main(String[] args) {

    }
}
