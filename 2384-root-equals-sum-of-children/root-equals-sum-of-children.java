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
    public boolean checkTree(TreeNode root) 
    {
        // If there is not a root and its children (0 + 0 = 0)
        if (root == null && root.left == null && root.right == null)
        {
            return true;
        }

        int sum = root.left.val + root.right.val;

        if (sum == root.val)
        {
            return true;
        }

        return false;
        
    }
}