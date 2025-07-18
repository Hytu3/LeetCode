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
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
        // Use preorder traversal
        
        // Base cases
        if (root == null)
        {
          return false;  
        }

        // If root has no children and the value equals to target sum return true
        if (root.left == null && root.right == null && root.val == targetSum)
        {
           return true; 
        }

        int remainingSum = targetSum - root.val;

        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
        
    }
}