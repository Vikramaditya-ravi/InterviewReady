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
        ListNode result = head;
        Map<ListNode, Integer> map = new HashMap<>();

        while (result != null) {

            if (map.containsKey(result)) {
                return result;
            } else {
                map.put(result, 1);
            }
            result = result.next;

        }

        return null;
        
        
        
    }
}