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
    public boolean isUnivalTree(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        treeToArrayList(root, list); // Pass the list as an argument

        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (!list.get(i).equals(list.get(j)))
                {
                    return false;
                }
            }      
        }

        return true;
    }

    public void treeToArrayList(TreeNode root, List<Integer> list)
    {
        if (root == null)
        {
            return;
        }

        list.add(root.val);
        treeToArrayList(root.left, list);
        treeToArrayList(root.right, list);
    }
}
