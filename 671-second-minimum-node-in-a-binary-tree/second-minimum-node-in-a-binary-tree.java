/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int findSecondMinimumValue(TreeNode root) 
    {
        // Use set to find unique elements
        Set<Integer> set = new HashSet<>();
        
        // Traverse tree
        traverse(root, set);

        PriorityQueue <Integer> minHeap = new PriorityQueue<>();

        // Add set elements to min heap
        for (Integer element : set) 
        {
            minHeap.add(element);
        }

        // Remove smallest element
        minHeap.poll();

        if (minHeap.isEmpty())
        {
            return -1;
        }
        
        return minHeap.peek();
        
    }

    public void traverse(TreeNode node, Set<Integer> set) 
    {
        if (node == null) return;

        traverse(node.left, set);   // left
        set.add(node.val);          // root
        traverse(node.right, set);  // right
    }
}