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
    public int getLen(ListNode head) {
        int size = 0;
        while(head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        int len = getLen(head);
        k = k % len;
        int rem = len-k;
        ListNode newEnd = head;
        for(int i = 1; i < rem; i++) {
            newEnd = newEnd.next;
        }
        ListNode end = newEnd;
        while(end.next != null) end = end.next;
        end.next = head;
        head = newEnd.next;
        newEnd.next = null;
        return head;
    }
}
