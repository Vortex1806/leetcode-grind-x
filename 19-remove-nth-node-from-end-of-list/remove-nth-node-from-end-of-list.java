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
        ArrayList<ListNode> ls = new ArrayList<>();
        for(ListNode temp = head; temp!=null; temp = temp.next) {
            ls.add(temp);
        }
        int index = ls.size() - n;
        if(index == 0) return head.next;
        ls.get(index-1).next = ls.get(index).next;
        return head;
    }
}