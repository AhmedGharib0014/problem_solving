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
       Stack<ListNode> stackA = new Stack<>();
        Stack<ListNode> stackB = new Stack<>();

        ListNode currentA = headA;
        ListNode currentB = headB;

        ListNode ans=null;



        while (currentA != null){
                stackA.push(currentA);
                currentA= currentA.next;
        }

        while (currentB != null){
                stackB.push(currentB);
                currentB= currentB.next;
        }

        while (!stackB.isEmpty() && !stackA.isEmpty()&& stackA.peek()==stackB.peek()){
            ans=stackA.pop();
            stackB.pop();
        }

        return ans;

    }
}