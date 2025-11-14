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
    public List<Integer> largestValues(TreeNode root) 
    {
        List <Integer> list = new ArrayList<>();
        
        
        if (root == null)
        {
            return list;
        }
        

        Queue <TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty())
        {
            List <Integer> iList = new ArrayList<>();

            int level = q.size();

            for (int i = 0; i < level; i++)
            {
                TreeNode current = q.poll();
                
                
                iList.add(current.val);

                if (current.left != null)
                {
                    q.offer(current.left);
                }

                if (current.right != null)
                {
                    q.offer(current.right);
                }

            }

            int max = Collections.max(iList);

            list.add(max);
        }


        return list;
        
    }
}