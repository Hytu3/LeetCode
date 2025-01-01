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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode current = head;

        // Need to set both the head node and next node to be not be a null pointer exception
        while (current != null && current.next != null)
        {
            if (current.val == current.next.val)
            {
                // Sets pointer from the next node to the node after it
                current.next = current.next.next;
                
            }
            else
            {
                //Set current to the next node
                current = current.next;   
            }
            
        }
        return head;
    }
}