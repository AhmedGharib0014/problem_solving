package add_two_numbers;

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
            // init local variables
            ListNode newNode = new ListNode(0);
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) {
                v1 = l1.val;
            }
            if (l2 != null) {
                v2 = l2.val;
            }

            // perform calculation and assign values
            int value = v1 + v2 + carry;
            carry = value / 10;
            newNode.val = value % 10;

            // update pointers
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
