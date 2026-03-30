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
    public void reorderList(ListNode head) {
        ListNode fs = head;
        ListNode sl = head;

        while(fs != null && fs.next != null){
            sl = sl.next;
            fs = fs.next.next;
        }
        ListNode sec = sl.next;
        ListNode pv = sl.next = null;
        while(sec != null){
            ListNode tmp = sec.next;
            sec.next = pv;
            pv = sec;
            sec = tmp;
        }
        ListNode first = head;
        sec = pv;
        while(sec != null){
            ListNode tm1 = first.next;
            ListNode tm2 = sec.next;
            first.next = sec;
            sec.next = tm1;
            first = tm1;
            sec = tm2;
        }
    }
}
