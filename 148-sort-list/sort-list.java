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
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        if(list1 != null) tail.next = list1;
        if(list2 != null) tail.next = list2;
        return dummyHead.next;
    }

    public ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode midPrev = getMid(head);
        ListNode mid = midPrev.next;
        midPrev.next = null;
        ListNode first = mergeSort(head);
        ListNode end = mergeSort(mid);
        return merge(first, end);
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        return mergeSort(head);
    }
}