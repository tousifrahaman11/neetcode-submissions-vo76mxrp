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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dm = new ListNode(0, head);

        ListNode lf = dm;
        ListNode rh = head;

        while(n > 0){
            rh = rh.next;
            n--;
        }

        while(rh != null){
            lf = lf.next;
            rh = rh.next;
        }
        lf.next = lf.next.next;
        return dm.next;
    }
}
