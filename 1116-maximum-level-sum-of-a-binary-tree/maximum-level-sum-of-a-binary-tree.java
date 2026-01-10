class Solution 
{
    public int maxLevelSum(TreeNode root) 
    {
        // Variables for sum tracking and level checking
        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        int smallestLevel = 1;

        Queue<TreeNode> q = new LinkedList<>();

        // Populate the queue first
        q.offer(root);

        // Breadth first search
        while (!q.isEmpty())
        {
            int levelSize = q.size(); // number of nodes in current level
            int sum = 0;

            // Process current level
            for (int i = 0; i < levelSize; i++)
            {
                TreeNode current = q.poll();

                // Process current node
                sum += current.val;

                // Check children nodes
                if (current.left != null)
                {
                    q.offer(current.left);
                }

                if (current.right != null)
                {
                    q.offer(current.right);
                }
            }

            // Logic to track smallest level with max sum
            if (sum > maxSum)
            {
                maxSum = sum;
                smallestLevel = level;
            }

            level++;
        }

        return smallestLevel;
    }
}
