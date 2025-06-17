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
        public List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> list = new ArrayList<>();
        if (root == null) 
        {
            return list;
        }
        
        if (root.left == null && root.right == null) 
        {
            list.add(Integer.toString(root.val));
            return list;
        }
        
        List<String> leftPaths = binaryTreePaths(root.left);
        for (int i = 0; i < leftPaths.size(); i++) 
        {
            list.add(root.val + "->" + leftPaths.get(i));
        }
        
        List<String> rightPaths = binaryTreePaths(root.right);
        for (int i = 0; i < rightPaths.size(); i++) 
        {
            list.add(root.val + "->" + rightPaths.get(i));
        }
        
        return list;
    }

}
