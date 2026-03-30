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
    public boolean hasCycle(ListNode head) {
        ListNode fs = head;
        ListNode sl = head;

        while(fs != null && fs.next != null){
            fs = fs.next.next;
            sl = sl.next;

            if(fs == sl) return true;
        }
        return false;
    }
}
