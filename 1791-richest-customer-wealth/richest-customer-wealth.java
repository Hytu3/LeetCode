class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int max = 0;
        
        for (int i = 0; i < accounts.length; i++)
        {
            // The sum of all values in a row
            int rowMax = 0;
            
            for (int j = 0; j < accounts[i].length; j++)
            {
                rowMax += accounts[i][j];
            }

            // Compare rowMax to total max
            if (rowMax >= max)
            {
                max = rowMax;
            }
        }

        return max;
        
    }
}