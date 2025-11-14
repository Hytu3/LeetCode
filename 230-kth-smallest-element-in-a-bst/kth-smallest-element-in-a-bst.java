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
class Solution 
{
    public int kthSmallest(TreeNode root, int k) 
    {
        PriorityQueue <Integer> minHeap = new PriorityQueue<>();

        // Helper function to add node values to minHeap
        traverseTree(root, minHeap);

        while (k > 1)
        {
            minHeap.poll();
            k--;
        }

        int result = minHeap.peek();

        return result;

        
    }

    // In order helper traversal function
    public void traverseTree(TreeNode root, PriorityQueue<Integer> minHeap )
    {
        if (root == null)
        {
            return;
        }

        traverseTree(root.left, minHeap);
        minHeap.offer(root.val);
        traverseTree(root.right, minHeap);
        
    }
}