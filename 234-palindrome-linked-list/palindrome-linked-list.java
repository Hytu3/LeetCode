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
        ListNode current = head;

        // Variable to keep track of array size
        int size = 0;

        // If the list is empty, it's technically a palindrome
        if (current == null) {
            return true;
        }

        // Traversing the list to determine the size
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] array = new int[size]; // Creates an array of the same size as the linked list

        // Reset current to the head of the list so you caan traverse again
        current = head;
        int index = 0;

        // Populating the array with values from the linked list
        while (current != null) {
            array[index] = current.val;
            index++;
            current = current.next;
        }

        // Checking if the array is a palindrome  starting from left side and a right side
        int left = 0;
        int right = array.length - 1;

        // Checking values until they meet at the middle, if they dont match return false if they do return true
        while (left < right) {
            if (array[left] != array[right]) {
                return false; 
            }
            left++;
            right--;
        }

        return true; // All values were matched
    }
}
