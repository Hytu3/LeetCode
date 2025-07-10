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
    public int getDecimalValue(ListNode head) 
    {
        ListNode reverseList = reverseLinkedList(head);
        ListNode current = reverseList;
        int sum = 0;
        int exponent = 0;

        // Traverse reverse linked list
        while (current != null)
        {
            // Add each node value to sum and gradually increase each exponent by iteration
            
            sum += (current.val * (int) Math.pow(2, exponent));

            current = current.next;

            exponent++;

        }

        return sum;
        
    }

    // Helper function
    public ListNode reverseLinkedList(ListNode head) 
    {
            ListNode prev = null;
            ListNode current = head;

            while (current != null) 
            {
                ListNode nextTemp = current.next;
                current.next = prev;
                prev = current;
                current = nextTemp;
            }

            return prev;
    }


}

