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
    public ListNode deleteDuplicates(ListNode head) {
         ListNode res = new ListNode(-10000);
            ListNode dummy = res;
            while (head!= null ){
                                ListNode temp = new ListNode( head.val);

                if(res.val != temp.val){
                    res.next = temp;
                    res = res.next;
                }

                head = head.next;

            }
            return dummy.next;
    }
}