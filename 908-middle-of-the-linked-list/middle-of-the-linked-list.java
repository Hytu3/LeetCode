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
        // Calculate the size of the linked list
        int size = 0;
        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        // Find the middle index
        int middleIndex = size / 2;

        // Traverse to the middle node
        current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        // Return the middle node, which starts the new list
        return current;
    }
}

