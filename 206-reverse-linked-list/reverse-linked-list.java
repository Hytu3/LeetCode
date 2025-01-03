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
    public ListNode reverseList(ListNode head) 
    {
        // Variable to keep track of the node
        ListNode current = head;

        // Creating a stack that will hold elements of the original linked list
        Stack<Integer> stack = new Stack<>();

        // Traverse the list and push values onto the stack
        while (current != null)
        {
            stack.push(current.val);
            current = current.next;
        }

        // Declare ReverseList as the head of the reversed list
        ListNode ReverseList = null;
        ListNode temp = null;

        // Pop elements and build the reversed list
        while (!stack.isEmpty()) 
        {
            int poppedElement = stack.pop();
            ListNode newNode = new ListNode(poppedElement);

            if (ReverseList == null) 
            {
                ReverseList = newNode; // Initialize the reversed list head
                temp = ReverseList;   // Temp points to the last node added
            } 
            else 
            {
                temp.next = newNode;  // Link the new node to the reversed list
                temp = temp.next;     // Move temp to the new node
            }
        }
        
        return ReverseList;
    }
}

