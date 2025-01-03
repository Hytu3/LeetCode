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
class Solution 
{
    public ListNode removeElements(ListNode head, int val) 
    {
        // Handle cases where head nodes need to be removed
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        // Set up a current variable to keep track of current node
        ListNode current = head;

        // Traversing through the list
        while (current != null && current.next != null)
        {
            if (current.next.val == val)
            {
                // Skip the node with the target value
                current.next = current.next.next;
            }
            else
            {
                // Only move forward if we didn't remove a node
                current = current.next;
            }
        }

        return head;
    }
}