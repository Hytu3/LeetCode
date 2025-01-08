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
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        // If both trees are empty
        if (p == null && q == null)
        {
            return true;
        }
        
        // If one node is null but the other is not
        if (p == null || q == null) 
        {
            return false;
        }

        // Check if current nodes' values are the same and recurse on left and right subtrees
        return (p.val == q.val) &&
               isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
        
    }
}