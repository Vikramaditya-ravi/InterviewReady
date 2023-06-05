/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry ;
        while (fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                entry = head;
                while (entry != slow){
                    entry = entry.next;
                    slow =slow.next;
                }
                return entry;
                
            }
        }
        return null;
        
        
        
    }
}