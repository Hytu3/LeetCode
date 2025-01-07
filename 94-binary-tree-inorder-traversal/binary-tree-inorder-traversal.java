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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); // Initialize the result list
        if (root == null) {
            return result; // If the tree is empty, return an empty list
        }
        result.addAll(inorderTraversal(root.left)); // Add the left subtree's values
        result.add(root.val); // Add the roots value
        result.addAll(inorderTraversal(root.right)); // Add the right subtree's values
        return result; // Return the collected result
    }
}
