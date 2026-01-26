
class Solution 
{
    public int deepestLeavesSum(TreeNode root) 
    {
        int sum = 0;
        
        // Breadth first search

        Queue <TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty())
        {
            // Resets sum to zero every time until last iteration
            sum = 0;
            
            int level = q.size(); 

            for (int i = 0; i < level; i++)
            {
                TreeNode current = q.poll();

                sum += current.val;

                if (current.left != null)
                {
                    q.offer(current.left);
                }

                if (current.right != null)
                {
                    q.offer(current.right);
                }
            }
        }

        return sum;
        
    }
}