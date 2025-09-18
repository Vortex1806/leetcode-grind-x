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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode getMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        ListNode mid = getMid(head);
        ListNode secHead = reverse(mid.next);
        mid.next = null;

        ListNode temp1 = head;
        ListNode temp2 = secHead;
        ListNode dummyHead = new ListNode(-1);
        ListNode temp = dummyHead;

        while(temp1 != null && temp2 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
        if(temp1 != null) temp.next = temp1;
        if(temp2 != null) temp.next = temp2;

        head = dummyHead.next;
    }
}