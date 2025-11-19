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
    public int minDiffInBST(TreeNode root) 
    {
        List<Integer> list = new ArrayList<>();
        
        // Traverse and add all nodes to a list
        traverseBST(root, list);
        

        // Sort
        Collections.sort(list);


        int min = Integer.MAX_VALUE;

        // Find min difference
        for (int i = 1; i < list.size(); i++)
        {
            int j = i - 1;

            int diff = list.get(i) - list.get(j);

            if (diff <= min)
            {
                min = diff;
            }
        }

        return min;
        
    }

    public void traverseBST(TreeNode root, List<Integer> list) 
    {
        if (root == null)
        {
            return;
        }

        traverseBST(root.left, list);
        list.add(root.val);
        traverseBST(root.right, list);
        
    }
}