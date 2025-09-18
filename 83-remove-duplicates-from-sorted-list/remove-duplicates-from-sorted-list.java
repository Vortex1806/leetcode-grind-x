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
        if(head == null)return head;
        ListNode temp = head;
        ListNode current = head;
        while(current != null) {
            if (current.val != temp.val) {
                temp.next = current;
                temp = current;
            }
            current = current.next;
        }
        temp.next = current;
        return head;
    }
}