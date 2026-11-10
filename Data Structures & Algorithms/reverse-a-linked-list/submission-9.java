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
    public ListNode reverseList(ListNode head) {
        // Input Validation
        if (head == null) {
            return null;
        }

        ListNode newHead = new ListNode(head.val);
        head = head.next;

        while (head != null) {
            ListNode newNode = new ListNode(head.val, newHead);
            newHead = newNode;
            head = head.next;
        }
        return newHead;
    }
}
