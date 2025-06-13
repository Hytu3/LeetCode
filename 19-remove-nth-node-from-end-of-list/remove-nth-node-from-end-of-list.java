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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null)
        {
            list.add(head.val);
            head = head.next;
        }

        // Remove the nth element of the arrayList
        list.remove(list.size() - n);
        
        // Edge case: If the list is now empty, return null
        if (list.isEmpty()) return null;
        
        // Build the new linked list
        ListNode NewList = new ListNode(list.get(0));
        ListNode current = NewList;

        for (int i = 1; i < list.size(); i++) 
        {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }

        return NewList;

    }
}