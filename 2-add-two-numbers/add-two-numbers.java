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
import java.math.BigInteger;

class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        ListNode current1 = l1;
        ListNode current2 = l2;

        // Traverse both linked lists and add each value to two new stringbuilders
        while (current1 != null) 
        {
            sb1.append(current1.val);
            current1 = current1.next;
        }

        while (current2 != null) 
        {
            sb2.append(current2.val);
            current2 = current2.next;
        }

        // Reverse the strings and convert to BigInteger
        String reversed1 = sb1.reverse().toString();
        String reversed2 = sb2.reverse().toString();

        BigInteger reverse1 = new BigInteger(reversed1);
        BigInteger reverse2 = new BigInteger(reversed2);

        // Get the sum of the new integers
        BigInteger sum = reverse1.add(reverse2);

        // Add each digit backwards to a new linked list
        ListNode NewList = new ListNode(0);
        ListNode current = NewList;

        // If previous linked lists have zero also return 0 for the new linked list
        if (sum.equals(BigInteger.ZERO))
        {
            return NewList;
        }  

        while (sum.compareTo(BigInteger.ZERO) > 0)
        {
            current.next = new ListNode(sum.mod(BigInteger.TEN).intValue());
            current = current.next;
            sum = sum.divide(BigInteger.TEN);
        }

        // Skip the head of the list because if you don't, linked list will have a 0 in front of it
        return NewList.next; 
    }
}

