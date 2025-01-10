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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric
        }

        // Create the mirrored tree
        TreeNode mirroredRoot = mirrorTree(root);

        // Compare the original tree with the mirrored tree
        return isSameTree(root, mirroredRoot);
    }

    // Helper method to create the mirrored tree
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null; // Base case: If the original tree is empty
        }

        // Create a new node for the mirrored tree with the same value as the current node
        TreeNode newNode = new TreeNode(root.val);

        // Recursively invert and assign the subtrees
        newNode.left = mirrorTree(root.right); // Mirror the right subtree to the left
        newNode.right = mirrorTree(root.left); // Mirror the left subtree to the right

        return newNode; // Return the new mirrored tree node
    }

    // Helper method to compare two trees for equality
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true; // Both trees are empty
        }

        if (p == null || q == null) {
            return false; // One tree is empty, and the other is not
        }

        // Check if the current nodes have the same value and recursively check their children
        return (p.val == q.val) &&
               isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
