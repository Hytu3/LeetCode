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
    public boolean evaluateTree(TreeNode root) {
        // If it's a leaf node
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        // Recursively evaluate left and right
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);

        // Internal node with OR
        if (root.val == 2) {
            return left || right;
        }
        // Internal node with AND
        else {
            return left && right;
        }
    }
}
