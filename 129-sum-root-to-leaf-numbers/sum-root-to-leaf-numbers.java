
class Solution 
{
    public int sumNumbers(TreeNode root) 
    {
        int sum = 0;

        // Fill a list with integers representing each root to leaf path

        List<Integer> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        // Use helper to build a list
        getPaths(root, list, sb);

        // Traverse list and add each value to sum
        for (int number : list)
        {
            sum += number;
        }

        return sum;

    }

    public void getPaths(TreeNode root, List<Integer> list, StringBuilder sb)
    {
        if (root == null)
        {
            return;
        }
        
        
        // Leaf found
        if (root.left == null && root.right == null)
        {
            // Add leafs value
            sb.append(root.val);
            
            // Convert to string than integer
            String s = sb.toString();
            int path = Integer.parseInt(s);
            
            // Add to list and remove leaf val from stringbuilder
            list.add(path);

            sb.deleteCharAt(sb.length() - 1);

        }

        // Process current root
        sb.append(root.val);

        // Recursive calls
        getPaths(root.left, list, sb);
        getPaths(root.right, list, sb);

        // Backtrack
        sb.deleteCharAt(sb.length() - 1);

    }
}