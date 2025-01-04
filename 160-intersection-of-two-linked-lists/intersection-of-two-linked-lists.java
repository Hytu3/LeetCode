/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Initialize two pointers to traverse the lists
        ListNode current1 = headA;
        ListNode current2 = headB;

        // Traverse both lists
        while (current1 != current2) {
            // If one pointer reaches the end, redirect it to the head of the other list
            current1 = (current1 == null) ? headB : current1.next;
            current2 = (current2 == null) ? headA : current2.next;
        }

        // If they meet, return the intersection node; otherwise, null
        return current1;
    }
}
