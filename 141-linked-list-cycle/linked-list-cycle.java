/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // ListNode fast = head;
        // ListNode slow = head;
        // while(fast != null && fast.next != null) {
        //     fast = fast.next.next;
        //     slow = slow.next;
        //     if(fast == slow)return true;
        // }
        // return false;
        ListNode temp = head;
        Map<ListNode, Integer> mpp = new HashMap<>();
        while(temp != null) {
            if(mpp.containsKey(temp))return true;
            mpp.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }
}