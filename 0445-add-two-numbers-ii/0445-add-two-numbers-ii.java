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
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();

        while (l1 != null) {
            stack.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack1.push(l2.val);
            l2 = l2.next;
        }


        ListNode curr = null;
        int carry = 0;

        while (!stack1.isEmpty() || !stack.isEmpty() || carry == 1) {
            int sum = 0;


            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack.isEmpty()) {
                sum += stack.pop();
            }
            sum += carry;
            ListNode newNode = new ListNode((sum % 10));
            newNode.next = curr;
            curr = newNode;
            carry = sum / 10;

        }
        return curr;


    }

}