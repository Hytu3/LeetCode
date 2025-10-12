class Solution 
{
    public int heightChecker(int[] heights) 
    {
        // Make the expected array
        
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        int count = 0;

        // Compare them 1 by 1
        
        for (int i = 0; i < heights.length; i++)
        {
            if (heights[i] != expected[i])
            {
                count++;
            }
        }

        return count; 
    }
}