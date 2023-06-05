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
    
    
       public ListNode reverseListIterative(ListNode head) {

        ListNode newNode = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }
        return newNode;
    }

    public ListNode utility(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode(-1);
        ListNode dummy = res;

        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;

            if(l1!= null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if (l2!= null){
                sum+=l2.val;
                l2 = l2.next;

            }
            sum+=carry;
            ListNode node = new ListNode((sum%10));
            res.next = node;
            res = res.next;
            carry = sum/10;
        }
        return dummy.next;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseListIterative(l1);
        l2 = reverseListIterative(l2);
        ListNode result = utility(l1, l2);
        return reverseListIterative(result);


    }
}