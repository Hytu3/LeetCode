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
    private int total = 0;

    public int sumRootToLeaf(TreeNode root) 
    {
        dfs(root, "");
        return total;
    }

    private void dfs(TreeNode node, String path) 
    {
        if (node == null) return;

        // Add current node value to the path
        path += node.val;

        // If it's a leaf, parse the binary string and add to total
        if (node.left == null && node.right == null) 
        {
            total += Integer.parseInt(path, 2); // interpret as base-2
            return;
        }

        // Continue traversing down the tree
        dfs(node.left, path);
        dfs(node.right, path);
    }
}
