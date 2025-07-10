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
    public boolean isPalindrome(ListNode head) {
        ListNode copy = copyList(head);               // Clone the list
        ListNode reversed = reverseLinkedList(copy);  // Reverse the clone

        ListNode current1 = head;
        ListNode current2 = reversed;

        while (current1 != null && current2 != null) {
            if (current1.val != current2.val) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }

    public ListNode copyList(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (head != null) {
            current.next = new ListNode(head.val);
            current = current.next;
            head = head.next;
        }

        return dummy.next;
    }
}
