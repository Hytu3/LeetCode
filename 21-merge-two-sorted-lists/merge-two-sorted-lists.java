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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        // Variables used to keep track of current node in each list
        ListNode current1 = list1;
        ListNode current2 = list2;

        // Creates a new sorted node list by the merging of the 2 previous lists
        ListNode SortedNode = new ListNode(-1);
        ListNode currentS = SortedNode;

        while (current1 != null && current2 != null)
        {
            // Initialize currentS.next
            currentS.next = new ListNode(0);
            
            if (current1.val >= current2.val)
            {
                // Just take the smaller value (current2)
                currentS.next = new ListNode(current2.val);
                current2 = current2.next;
            }
            else
            {
                // Just take the smaller value (current1)
                currentS.next = new ListNode(current1.val);
                current1 = current1.next;
            }
            currentS = currentS.next;
        }

        // Handle remaining elements in list1
        while (current1 != null) {
            currentS.next = new ListNode(current1.val);
            current1 = current1.next;
            currentS = currentS.next;
        }

        // Handle remaining elements in list2
        while (current2 != null) {
            currentS.next = new ListNode(current2.val);
            current2 = current2.next;
            currentS = currentS.next;
        }
        
        return SortedNode.next;  // Return the next node since first one was dummy
    }
}