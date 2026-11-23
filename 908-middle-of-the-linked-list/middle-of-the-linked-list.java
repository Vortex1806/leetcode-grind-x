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
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodelist = new ArrayList<>();
        ListNode temp = head;
        for(temp = head; temp != null; temp = temp.next) {
            nodelist.add(temp);
        }

        return nodelist.get(nodelist.size()/2);
    }
}