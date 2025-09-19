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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k <= 1)return head;
        ListNode prev = null;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        prev = dummyNode;
        ListNode gPrev = dummyNode;
        ListNode cur = head;
        ListNode next = null;

        while(cur != null) {
            ListNode kth = getKthNode(gPrev, k);
            if(kth == null) break;

            for(int i = 0; i < k; i++) {
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            ListNode last = gPrev.next;
            last.next = next;
            gPrev.next = prev;
            prev = last;
            gPrev = prev;
        }
        return dummyNode.next;
    }

    ListNode getKthNode(ListNode gPrev, int k) {
        ListNode temp = gPrev;
        while(temp != null) {
            if(k == 0)return temp;
            temp = temp.next;
            k--;
        }
        return null;
    }
}