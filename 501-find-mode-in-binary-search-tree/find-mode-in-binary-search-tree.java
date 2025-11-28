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
    public int[] findMode(TreeNode root) 
    {
        HashMap <Integer, Integer> map = new HashMap<>();

        // Helper method to traverse bst
        traverse(root, map);

        // Get the highest value / frequency
        int maxFreq = Collections.max(map.values());

        int countMode = 0;

        // Count occurences of maxFreq
        for (int value : map.values())
        {
            if (value == maxFreq)
            {
                countMode++;
            }
        }

        // Declare an array of size countMode
        int[] arr = new int[countMode];

        int index = 0;
        
        // Go through each entry
        for (Map.Entry <Integer,Integer> entry : map.entrySet())
        {
            // Every key that has the maxFreq gets added to the array
            if (entry.getValue() == maxFreq)
            {
                arr[index] = entry.getKey();
                index++;
            }
        }

        return arr;
        
    }

    public void traverse(TreeNode root, HashMap <Integer,Integer> map)
    {
        if (root == null)
        {
            return;
        }

        traverse(root.left, map);

        // Process current node
        int count = 1;
        
        if (map.containsKey(root.val))
        {
            count = map.get(root.val) + 1;
        }

        map.put(root.val, count);

        traverse(root.right, map);
    }
}